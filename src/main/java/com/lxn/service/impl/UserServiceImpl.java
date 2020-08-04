package com.lxn.service.impl;

import com.lxn.dao.UserDao;
import com.lxn.dao.impl.UserDaoImpl;
import com.lxn.pojo.User;
import com.lxn.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDaoImpl();

    @Override
    public User login(User user) {
        return userDao.Login(user);
    }

}
