package com.maowudi.integrals.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 战区实体类
 */
@Data
public class WarZone implements Serializable {

    private Integer id;

    private String warZoneName;//战区名称

    private String warZoneAdminId;//战区负责人ID

    private String warZoneAdminName;//战区负责人名称
}
