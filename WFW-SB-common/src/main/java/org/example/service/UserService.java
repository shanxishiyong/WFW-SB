package org.example.service;

import org.example.domin.User;

import java.util.List;

public interface UserService {
    /**
     * 单个数据插入
     */
    public int insertUser(User user);

    /**
     * 查询所有的user信息
     *
     */
    public List<User> selectAllUser();
}
