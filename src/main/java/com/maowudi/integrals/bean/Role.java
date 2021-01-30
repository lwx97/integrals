package com.maowudi.integrals.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Role implements Serializable {

    private Integer roleId;

    private String roleName;

    private Integer roleCode;

    private String description;

    private String available;

    private List<Permissions> permissions;

}
