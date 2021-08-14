package com.baizhi.controller;

import com.baizhi.entities.User;
import com.baizhi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController// @Controller + @ResponseBody
@RequestMapping(value = "/FormUserManager")
public class FormUserController {
    //注入Service的实现类
    @Autowired
    private IUserService userService;

    // (1)、 注册用户
    @PostMapping(value = "/registUser")
    @ResponseBody
    public User registUser(User user) throws Exception {
        userService.registUser(user);
        return user;
    }

    //（2）、删除用户
    @DeleteMapping(value = "/deleteByIds")
    @ResponseBody
    public void deleteByIds(@RequestParam(value = "ids") Integer[] ids) {
        userService.deleteByIds(ids);

    }

    //（3）、改
    @PutMapping(value = "/updateUser")
    @ResponseBody
    public User updateUser(User user) {
        User user1 = userService.updateUser(user);
        return user1;
    }

    //（4）、数据库中查询
    @GetMapping("/queryById")
    @ResponseBody
    public User queryById(@RequestParam(value = "id") Integer id) {
        User user1 = userService.queryById(id);
        System.out.println(user1);
        return user1;
    }
}
