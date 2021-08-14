package com.sxyh.controller;

import com.sxyh.service.IUserService;
import com.sxyh.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController// @Controller + @ResponseBody
@RequestMapping(value = "/FormUserManager")
public class FormUserController {
    //注入Service的实现类
    @Autowired
    private IUserService userService;

    //（4）、数据库中查询
    @GetMapping("/queryById")
    @ResponseBody
    public User queryById(@RequestParam(value = "id") Integer id) {
        User user1 = userService.queryById(id);
        System.out.println(user1);
        return user1;
    }
}
