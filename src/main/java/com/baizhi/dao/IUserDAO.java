package com.baizhi.dao;

import com.baizhi.entities.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDAO {

    public void registUser(User user);

    public void deleteById(@Param("id") Integer id);

    public void updateUser(User user);

    public User queryById(@Param("id") Integer id);


 }
