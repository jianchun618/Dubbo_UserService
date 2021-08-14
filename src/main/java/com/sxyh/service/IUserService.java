package com.sxyh.service;

import com.sxyh.entities.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {
    public User queryById(@Param("id") Integer id);

}
