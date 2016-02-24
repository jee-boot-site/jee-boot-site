import com.alibaba.fastjson.JSON;
import com.boot.sys.dao.SysUserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Ming on 2016/2/24.
 */
public class JunitTest extends AbstractServiceTests{

    @Autowired
    SysUserMapper sysUserMapper;

    @Test
    public void test_SysUserMapper() {
        logger.info(JSON.toJSONString(sysUserMapper.selectAll()));
    }

}
