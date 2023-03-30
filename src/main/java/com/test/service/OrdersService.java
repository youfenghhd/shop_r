package com.test.service;

import com.test.pojo.Orders;

import java.util.List;

public interface OrdersService {
    public List<Orders> findAll();
    public Orders findOrderById(Integer id);
    public List<Orders> findOrdersByUid(Integer uid);
}
