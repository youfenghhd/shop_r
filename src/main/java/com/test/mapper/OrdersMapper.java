package com.test.mapper;

import com.test.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrdersMapper {
    public List<Orders> findAll();
    public Orders findOrderById(Integer id);
    public List<Orders> findOrdersByUid(Integer uid);
}
