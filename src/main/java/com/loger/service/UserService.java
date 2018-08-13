package com.loger.service;

import com.loger.entity.User;

import java.util.List;

/**
 * Created by Loger
 * Date: 2018-02-12
 * TIme: 21:37
 * Description :
 */
public interface UserService {
    List<User> selectAll();
    User getUserById(Integer id);
}
