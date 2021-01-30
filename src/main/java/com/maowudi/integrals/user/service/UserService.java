package com.maowudi.integrals.user.service;

import com.maowudi.integrals.bean.User;
import com.maowudi.integrals.bean.paramsvo.UserParamsVo;

import java.util.List;

public interface UserService {
    List<User> getAllUser(UserParamsVo userParamsVo);

    Integer getAllUserTotal(UserParamsVo userParamsVo);
}
