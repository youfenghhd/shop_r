package com.test.controller;

import com.test.pojo.Orders;
import com.test.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @GetMapping(value = "")
    public List<Orders> findAll() {
        return ordersService.findAll();
    }

    @GetMapping(value = "/id/{id}")
    public Orders findOrderById(@PathVariable Integer id) {
        return ordersService.findOrderById(id);
    }

    @GetMapping(value = "/userId/{uid}")
    public List<Orders> findOrdersByUid(@PathVariable Integer uid) {
        return ordersService.findOrdersByUid(uid);
    }
}
