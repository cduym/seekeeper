/**
 * Project: otter_manager_biz-4.0.0
 * 
 * File Created at 2011-9-13 $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited. All rights reserved.
 * 
 * This software is the confidential and proprietary information of Alibaba Company. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with Alibaba.com.
 */
package com.taobao.open.config.user;

import java.util.List;

import com.taobao.open.model.user.User;

/**
 * @author simon
 */
public interface UserService {

    public List<User> listAllUsers();
}
