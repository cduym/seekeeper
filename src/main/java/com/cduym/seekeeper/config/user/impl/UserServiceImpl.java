/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.cduym.seekeeper.config.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cduym.seekeeper.config.user.UserService;
import com.cduym.seekeeper.config.user.dal.UserDao;
import com.cduym.seekeeper.config.user.dal.dataobject.UserDo;
import com.cduym.seekeeper.model.user.User;

/**
 * 类UserServiceImpl.java的实现描述：TODO 类实现描述
 * 
 * @author simon 2012-8-27 下午11:37:30
 * @version 4.1.0
 */
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private UserDao userDao;

    public List<User> listAllUsers() {
        List<UserDo> userDos = userDao.listAllUsers();
        List<User> users = new ArrayList<User>();
        for (UserDo userDo : userDos) {
            users.add(doToModel(userDo));
        }
        return users;
    }

    private User doToModel(UserDo userDo) {
        User user = new User();
        user.setId(userDo.getId());
        user.setName(userDo.getName());
        return user;
    }

    /* ------------------------setter / getter--------------------------- */

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
