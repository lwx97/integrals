package com.maowudi.integrals.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 支局/连锁门店
 */
@Data
public class BranchStore implements Serializable {

    private Integer bsId;//主键

    private String bsName;//支局/连锁门店

    private Integer bsType;//1:为支局，2为门店

    private Integer bsBranchType;//1:为城市，2为农村

    private String bsBranchAdmin;//负责人岗位名称，默认支局长

    private String bsAdminId;//负责人ID

    private String bsAdminName;//负责人名称
}
