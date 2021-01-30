package com.maowudi.integrals.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 军种实体类
 */
@Data
public class ArmedServices implements Serializable {

    private Integer armedServicesId; //主键

    private String armedServicesName; //军种名称

    private String asAdminId;//负责人ID

    private String asAdminName;//负责人

}
