import com.alibaba.fastjson.JSON;
import com.boot.common.utils.Encodes;
import com.boot.sys.dao.UserMapper;
import com.boot.sys.entity.User;
import com.boot.sys.security.SystemAuthorizingRealm;
import com.boot.sys.service.SystemService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Ming on 2016/2/24.
 */
public class JunitTest extends AbstractServiceTests{

    @Autowired
    UserMapper userMapper;

    @Autowired
    SystemService systemService;

//    @Test
//    public void test_SysUserMapper() {
//        logger.info(JSON.toJSONString(userMapper.selectAll()));
//    }


  /*  @Test
    public void test(){
        Example example = new Example(User.class);
        example.selectProperties("password","email");
        example.createCriteria().andCondition("id=", 10);
        logger.info("++++" +JSON.toJSONString(userMapper.selectByExample(example)));
    }

    @Test
    public void test_2(){
        User test = new User();
        test.setLoginName("thinkgem");
        logger.info(JSON.toJSONString(userMapper.selectOne(test)));
    }*/

    @Test
    public void test_systemService(){
        logger.info(JSON.toJSONString(systemService.getByLoginName("thinkgem")));
    }

    @Test
    public void test_shiro(){
        User user = systemService.getByLoginName("thinkgem");

        byte[] salt = Encodes.decodeHex(user.getPassword().substring(0, 16));

        SimpleAuthenticationInfo info = new  SimpleAuthenticationInfo(new SystemAuthorizingRealm.Principal(user, false),
                user.getPassword().substring(16), ByteSource.Util.bytes(salt), null);
    }

    @Test
    public void testHelloworld() {
        //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
        Factory<org.apache.shiro.mgt.SecurityManager> factory =  new IniSecurityManagerFactory("classpath:shiro.ini");


        //2、得到SecurityManager实例 并绑定给SecurityUtils
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
        try {
            //4、登录，即身份验证
            subject.login(token);
        } catch (AuthenticationException e) {
            //5、身份验证失败
        }
        Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录
        //6、退出
        subject.logout();
    }
}
