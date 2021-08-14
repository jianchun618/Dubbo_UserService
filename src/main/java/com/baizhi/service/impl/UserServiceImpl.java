package com.baizhi.service.impl;

import com.baizhi.dao.IUserDAO;
import com.baizhi.entities.User;
import com.baizhi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO userDAO;

    @Override
    public void registUser(User user) {
        userDAO.registUser(user);
    }


    @Override
    public void deleteByIds(Integer[] ids) {
        for (int i = 0; i < ids.length; i++) {
            userDAO.deleteById(ids[i]);
        }
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public User queryById(Integer id) {
        User user = userDAO.queryById(id);
        return user;
    }

    @Override
    public User updateUser(User user) {
        userDAO.updateUser(user);
        User user2 = userDAO.queryById(user.getId());
        return user2;
    }


}
