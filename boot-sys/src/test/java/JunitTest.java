import com.alibaba.fastjson.JSON;
import com.boot.sys.dao.UserMapper;
import com.boot.sys.entity.User;
import com.boot.sys.service.SystemService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by Ming on 2016/2/24.
 */
public class JunitTest extends AbstractServiceTests{

    @Autowired
    UserMapper userMapper;

    @Autowired
    SystemService systemService;

    @Test
    public void test_userMapper() {
        logger.info(JSON.toJSONString(userMapper.selectAll()));
    }


    @Test
    public void test(){
        Example example = new Example(User.class);
        example.selectProperties("loginName","name");
       /* example.createCriteria().andCondition("id=", 10);*/
        logger.info("++++" +JSON.toJSONString(userMapper.selectByExample(example)));
    }

    @Test
    public void test_getUserList(){
        logger.info(JSON.toJSONString(systemService.getUserList()));
    }

    @Test
    public void test_2(){
        User test = new User();
        test.setLoginName("thinkgem");
        logger.info(JSON.toJSONString(userMapper.selectOne(test)));
    }

    @Test
    public void test_systemService(){
        logger.info(JSON.toJSONString(systemService.getByLoginName("thinkgem")));
    }

    //---------------get value  from yml config
    @Value("${info.build.artifact}")
    private Integer age;

    @Test
    public void test_getValueFromYml(){
        System.out.println(age);
    }

    @Test
    public void test_selectByPrimaryKey(){
       /* User test = new User();
        test.setId("10");
        System.out.println(userMapper.selectByPrimaryKey(test));*/
        logger.info(JSON.toJSONString(userMapper.selectByPrimaryKey("10")));
    }

}
