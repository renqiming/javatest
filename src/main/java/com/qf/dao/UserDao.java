package com.qf.dao;

import com.qf.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findById(Integer id);
    Boolean update(User user);
    Boolean deleteById(Integer id);
    
}
