package com.loger.mapper;

import com.loger.entity.User;

import java.util.List;

/**
 * Created by Loger
 * Date: 2018-02-12
 * TIme: 21:29
 * Description :
 */
public interface UserMapper {
    List<User> selectAll();
    User getUserById(Integer id);
}
