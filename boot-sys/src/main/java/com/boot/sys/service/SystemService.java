package com.boot.sys.service;

import com.boot.common.utils.StringUtils;
import com.boot.sys.dao.UserMapper;
import com.boot.sys.entity.User;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ming on 2016/2/25.
 */
@Service
public class SystemService {

    private Logger logger = LoggerFactory.getLogger(SystemService.class);

    @Autowired
    private UserMapper userMapper;


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
        user.setName(loginName);
        logger.debug("The loginName"+ loginName);
        try {
            user =  userMapper.selectOne(user);
        }catch (TooManyResultsException e){
            logger.error(loginName+"存在多条记录");
        }
        return user;
    }

}
