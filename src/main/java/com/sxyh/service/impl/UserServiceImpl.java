package com.sxyh.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sxyh.dao.IUserDAO;
import com.sxyh.service.IUserService;
import com.sxyh.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO userDAO;

    @Override
    public User queryById(Integer id) {
        User user = userDAO.queryById(id);
        return user;
    }
}
