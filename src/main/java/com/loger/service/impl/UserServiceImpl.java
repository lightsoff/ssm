package com.loger.service.impl;

import com.loger.entity.User;
import com.loger.mapper.UserMapper;
import com.loger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Loger
 * Date: 2018-02-12
 * TIme: 21:39
 * Description :
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
