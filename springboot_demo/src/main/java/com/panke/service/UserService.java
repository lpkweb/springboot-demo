package com.panke.service;

import com.panke.entity.User;
import com.panke.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    public List<User> selectAllUsers() {
        return userMapper.selectAllUsers();
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    public List<User> selectUserByName(String userName) {
        return userMapper.selectUserByName(userName);
    }

    public Integer getUserCount() {
        return userMapper.getUserCount();
    }

}
