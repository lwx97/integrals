package com.maowudi.integrals.bean;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class User {

    private String userId;

    private String userName;

    private Integer jobNumber;

    private String accountName;

    private String salt;

    private String password;

    private List<Role> roles;
}
