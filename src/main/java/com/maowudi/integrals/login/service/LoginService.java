package com.maowudi.integrals.login.service;

import com.maowudi.integrals.bean.User;

public interface LoginService {

    User userLogin();

    User getMapByAccountName(String accountName);
}
