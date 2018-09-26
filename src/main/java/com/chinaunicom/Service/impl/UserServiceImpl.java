package com.chinaunicom.Service.impl;

import com.chinaunicom.Service.UserService;
import com.chinaunicom.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserDao userDao;

    @Override
    public User selectById(int id){
        User user = new User();
        return user;
//        return userDao.selectById(id);
    }
}
