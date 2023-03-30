package com.test.service;

import com.test.pojo.Orders;
import com.test.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(Integer id);
    public int save(User user);
    public int update(User user);
    public int delete(Integer id);
    public List<User> findUserWithOrders();
    public List<Orders> findOrdersWithUser();
    public User login(User user);
    public User findByName(String name);
    public int register(User user);
    public int updatePassword(User user);
    public int updateStatus(User user);
    public int findUserIdByUsername(String username);
    public User findUserByUsername(String username);
    public int updateUser(Integer id, String address, String password);
}
