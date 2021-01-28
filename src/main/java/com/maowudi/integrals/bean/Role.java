package com.maowudi.integrals.bean;

import lombok.Data;

import java.util.Set;

@Data
public class Role {

    private Integer roleId;

    private String roleName;

    private Integer roleCode;

    private String description;

    private String available;

    private Set<Permissions> permissions;
}
