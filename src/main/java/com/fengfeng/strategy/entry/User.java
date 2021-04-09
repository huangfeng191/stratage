package com.fengfeng.strategy.entry;

import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {
    private String name ;
    private String sex;
    private Integer id;
    private int age;
}
