package com.maowudi.integrals.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class User implements Serializable {

    private String userId;

    private String userName;//名称

    private Integer jobNumber;//工号

    private String accountName;//账号

    private String salt;//加密密码

    private String password;//密码

    private Integer status;//状态

    private String userCode;//营销积分人员编码

    private String userPhone;//手机号

    private String systemPhone;//系统内登记电话

    private String shuangjishuangkao;//双计双考（教育军种）

    private String pointAddress;//网点名称

    private WarZone warZone;//战区

    private Department department;//营销中心/两部一室/市公司二级中心

    private ArmedServices armedServices;//军种

    private BranchStore branchStore;//支局/连锁门店

    private List<Role> roles;


}
