package com.test.service;

import com.test.mapper.UserMapper;
import com.test.pojo.Orders;
import com.test.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public int save(User user) {
        return userMapper.save(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }

    @Override
    public List<User> findUserWithOrders() {
        return userMapper.findUserWithOrders();
    }

    @Override
    public List<Orders> findOrdersWithUser() {
        return userMapper.findOrdersWithUser();
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public int register(User user) {
        return userMapper.register(user);
    }

    @Override
    public int updatePassword(User user) {
        return userMapper.updatePassword(user);
    }
    @Override
    public int updateStatus(User user) {
        user.setStatus("1".equals(user.getStatus()) ? "0" : "1");
        return userMapper.updateStatus(user);
    }

    @Override
    public int findUserIdByUsername(String username) {
        return userMapper.findUserIdByUsername(username);
    }

    @Override
    public User findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }

    @Override
    public int updateUser(Integer id, String address, String password) {
        return userMapper.updateUser(id, address, password);
    }


}
