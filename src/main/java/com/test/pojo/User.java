package com.test.pojo;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String username;
    private String address;
    private String gender;
    private String password;
    private String status;
    private Double balance;
    private List<Orders> ordersList;
}
