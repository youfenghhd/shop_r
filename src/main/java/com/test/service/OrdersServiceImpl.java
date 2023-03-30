package com.test.service;

import com.test.mapper.OrdersMapper;
import com.test.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> findAll() {
        return ordersMapper.findAll();
    }

    @Override
    public Orders findOrderById(Integer id) {
        return ordersMapper.findOrderById(id);
    }

    @Override
    public List<Orders> findOrdersByUid(Integer uid) {
        return ordersMapper.findOrdersByUid(uid);
    }
}
