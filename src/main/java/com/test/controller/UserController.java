package com.test.controller;

import com.test.pojo.Orders;
import com.test.pojo.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public List<User> find() {
        return userService.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @PostMapping(value = "")
    public int save(User user) {
        return userService.save(user);
    }

    @PutMapping(value = "")
    public int update(User user) {
        return userService.update(user);
    }

    @DeleteMapping(value = "/{id}")
    public int delete(@PathVariable Integer id) {
        return userService.delete(id);
    }

    @GetMapping(value = "/withOrders")
    public List<User> findUserWithOrders() {
        return userService.findUserWithOrders();
    }

    @GetMapping(value = "/byOrders")
    public List<Orders> findOrdersWithUser() {
        return userService.findOrdersWithUser();
    }

    @PostMapping(value = "/login")
    public Boolean login(User user) {
        User res = userService.login(user);

        return res != null && "1".equals(res.getStatus());
    }

    @GetMapping(value = "/username/{name}")
    public User findByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    @PostMapping(value = "register")
    public Boolean register(User user) {
        return userService.register(user) > 0;
    }

    @PutMapping(value = "/updatePassword")
    public boolean updatePassword(User user) {
        return userService.updatePassword(user) > 0;
    }

    @PutMapping(value = "/updateStatus")
    public boolean updateStatus(User user) {
        return userService.updateStatus(user) > 0;
    }

    @GetMapping(value = "/findUserIdByUsername/{username}")
    public int findUserIdByUsername(@PathVariable String username) {
        return userService.findUserIdByUsername(username);
    }

    @GetMapping(value = "/findUserByUsername/{username}")
    public User findUserByUsername(@PathVariable String username) {
        return userService.findUserByUsername(username);
    }

    @PutMapping(value = "/updateUser/{id}/{address}/{password}")
    public boolean updateUser(@PathVariable Integer id, @PathVariable String address, @PathVariable String password) {
        return userService.updateUser(id, address, password) > 0;
    }

}
