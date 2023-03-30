package com.test.pojo;

import lombok.Data;

@Data
public class Orders {
    private Integer id;
    private String ordertime;
    private Double total;
    private Integer uid;
    private User user;

}
