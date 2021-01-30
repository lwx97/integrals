package com.maowudi.integrals.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 类型：（1为营销中心，2为两部一室，3为市公司二级中心
 */
@Data
public class Department implements Serializable {

    private Integer departmentId;

    private String departmentName;//中心、部门名称

    private Integer departmentType;//类型：（1为营销中心，2为两部一室，3为市公司二级中心）

    private String departmentAdminId;//负责人ID

    private String departmentAdminName;//负责人名称
}
