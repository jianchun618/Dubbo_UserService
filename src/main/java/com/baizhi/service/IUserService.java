package com.baizhi.service;

import com.baizhi.entities.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {
    public void registUser(User user);
    public void deleteByIds(Integer[] ids);
    public User updateUser(User user);
    public User queryById(@Param("id") Integer id);

}
