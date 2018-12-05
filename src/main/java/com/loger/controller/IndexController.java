package com.loger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Loger
 * Date: 2018-12-05
 * TIme: 20:31
 * Description :
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/page/{page}", method = RequestMethod.GET)
    public String page(@PathVariable(value = "page") String page) {
        return page;
    }

}
