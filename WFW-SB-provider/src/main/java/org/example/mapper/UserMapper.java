package org.example.mapper;

import org.example.domin.User;

import java.util.List;

public interface UserMapper {
    int insertUser(User user);

    List<User> selectAllUser();
}
