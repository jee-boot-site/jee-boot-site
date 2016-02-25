import com.alibaba.fastjson.JSON;
import com.boot.sys.dao.UserMapper;
import com.boot.sys.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by Ming on 2016/2/24.
 */
public class JunitTest extends AbstractServiceTests{

    @Autowired
    UserMapper userMapper;

//    @Test
//    public void test_SysUserMapper() {
//        logger.info(JSON.toJSONString(userMapper.selectAll()));
//    }


    @Test
    public void test(){
        Example example = new Example(User.class);
        example.selectProperties("password","email");
        example.createCriteria().andCondition("id=", 10);
        logger.info("++++" +JSON.toJSONString(userMapper.selectByExample(example)));
    }

    @Test
    public void test_2(){
        User test = new User();
        test.setName("admin");
        logger.info(JSON.toJSONString(userMapper.selectOne(test)));
    }

}
