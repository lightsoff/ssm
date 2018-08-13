package com.loger.controller;

import com.loger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Loger
 * Date: 2018-02-13
 * TIme: 0:03
 * Description :
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/test/listAll",method = RequestMethod.POST)
    public Object listAll(){
        return userService.selectAll();
    }

    @ResponseBody
    @RequestMapping(value = "/test/get",method = RequestMethod.POST)
    public Object get(){
        return userService.getUserById(1);
    }

}
