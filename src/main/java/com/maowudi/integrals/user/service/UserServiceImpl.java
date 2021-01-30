package com.maowudi.integrals.user.service;

import com.maowudi.integrals.bean.User;
import com.maowudi.integrals.bean.paramsvo.UserParamsVo;
import com.maowudi.integrals.user.dao.UserMapper;
import com.maowudi.integrals.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private RedisUtil redisUtil;

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser(UserParamsVo userParamsVo) {
        List<User> users = userMapper.getAllUser(userParamsVo);
        return users;
    }

    @Override
    public Integer getAllUserTotal(UserParamsVo userParamsVo) {
        Integer total = userMapper.getAllUserTotal(userParamsVo);
        return total;
    }
}
