package com.panke.controller;

import com.panke.entity.User;
import com.panke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add/user")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping(value = "/select/user")
    public List<User> selectAllUsers() {
        List<User> users = userService.selectAllUsers();
//        users.forEach(item -> {
//            System.out.println(item);
//        });
        return users;
    }

    @PutMapping(value = "/update/user")
    public void updateUser(@RequestParam(value = "userName") String userName,
                           @RequestParam(value = "password") String password,
                           @RequestParam(value = "realName") String realName,
                           @RequestParam(value = "id") Integer id) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setPassword(password);
        user.setRealName(realName);
        System.out.println(user);
        userService.updateUser(user);
    }

    @DeleteMapping(value = "/delete/user")
    public void deleteUser(@RequestParam(value = "id") Integer id) {
        userService.deleteUser(id);
    }

    @GetMapping(value = "/select/user/{id}/id")
    public User selectUserById(@PathVariable Integer id) {
        User userInfo = userService.selectUserById(id);
        return userInfo;
    }

    @GetMapping(value = "/select/user/{userName}/name")
    public List<User> selectUserByName(@PathVariable String userName) {
        List<User> users = userService.selectUserByName(userName);
        return users;
    }

    @GetMapping(value = "/select/user/count")
    public Integer getUserCount() {
        return userService.getUserCount();
    }

}
