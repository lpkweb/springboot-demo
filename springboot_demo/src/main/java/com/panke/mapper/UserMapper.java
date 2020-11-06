package com.panke.mapper;

import com.panke.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     * 添加用户
     * @param user
     */
    public void saveUser(User user);

    /**
     * 查询所有用户
     * @return
     */
    public List<User> selectAllUsers();

    /**
     * 修改用户
     * @param user
     */
    public void updateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Integer id);

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    public User selectUserById(Integer id);

    /**
     * 根据用户名查询所有用户
     * @param userName
     * @return
     */
    public List<User> selectUserByName(String userName);

    /**
     * 获取用户数
     * @return
     */
    public Integer getUserCount();
}
