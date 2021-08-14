package com.sxyh.dao;

import com.sxyh.entities.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDAO {
    public User queryById(@Param("id") Integer id);


 }
