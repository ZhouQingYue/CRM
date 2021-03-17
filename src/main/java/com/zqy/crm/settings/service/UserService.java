package com.zqy.crm.settings.service;

import com.zqy.crm.exception.LoginException;
import com.zqy.crm.settings.domain.User;


import java.util.List;

public interface UserService {

    User login(String loginAct, String loginPwd, String ip) throws LoginException;


    List<User> getUserList();
}
