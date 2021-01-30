package com.maowudi.integrals.user.dao;

import com.maowudi.integrals.bean.User;
import com.maowudi.integrals.bean.paramsvo.UserParamsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAllUser(UserParamsVo userParamsVo);

    Integer getAllUserTotal(UserParamsVo userParamsVo);
}
