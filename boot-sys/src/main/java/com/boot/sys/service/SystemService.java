package com.boot.sys.service;

import com.alibaba.fastjson.JSON;
import com.boot.common.utils.StringUtils;
import com.boot.sys.dao.UserMapper;
import com.boot.sys.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by Ming on 2016/2/25.
 */
@Service
public class SystemService {

    private Logger logger = LoggerFactory.getLogger(SystemService.class);

    @Autowired
     UserMapper userMapper;


    /**
     * 根据登录名获取用户
     * @param loginName
     * @return 取不到返回null
     */
    public  User getByLoginName(String loginName){
        if(StringUtils.isBlank(loginName)){
            logger.error("login name 为空");
            return null;
        }

        User user = new User();
        user.setLoginName(loginName);
        logger.debug("The loginName"+ loginName);

        user =  userMapper.selectOne(user);

        return user;
    }

    public List<User> getUserList(){
        Example example = new Example(User.class);
        example.selectProperties("loginName","name");
        example.createCriteria().andCondition("id=", 10);
        logger.info("++++" + JSON.toJSONString(userMapper.selectByExample(example)));
        return userMapper.selectByExample(example);
    }

}
