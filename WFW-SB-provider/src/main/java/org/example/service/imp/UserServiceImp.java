package org.example.service.imp;
import org.example.domin.User;
import org.example.mapper.UserMapper;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        int m = userMapper.insertUser(user);
        return 0;
    }

    public List<User> selectAllUser() {
        List<User> listUser = userMapper.selectAllUser();
        return listUser;
    }
}
