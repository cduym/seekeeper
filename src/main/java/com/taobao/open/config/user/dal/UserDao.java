/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.taobao.open.config.user.dal;

import java.util.List;

import com.taobao.open.config.user.dal.dataobject.UserDo;

/**
 * 类UserDao.java的实现描述：TODO 类实现描述
 * 
 * @author simon 2012-8-27 下午11:37:48
 * @version 4.1.0
 */
public interface UserDao {

    public List<UserDo> listAllUsers();

}
