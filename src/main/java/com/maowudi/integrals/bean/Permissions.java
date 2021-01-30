package com.maowudi.integrals.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Permissions implements Serializable {

    private Integer id;

    private String permission;
}
