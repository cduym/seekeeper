/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.taobao.open.config.user.dal.dataobject;

import java.io.Serializable;

/**
 * 类UserDo.java的实现描述：TODO 类实现描述
 * 
 * @author simon 2012-8-27 下午11:39:59
 * @version 4.1.0
 */
public class UserDo implements Serializable {

    private static final long serialVersionUID = 6373904824730876247L;
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
