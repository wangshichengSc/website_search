package com.wsc.websitesearch.login.service;

import com.wsc.websitesearch.login.model.LoginInfo;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoginService {

    public LoginInfo login(LoginInfo loginInfo) {
        loginInfo.setToken(makeToken());
        return loginInfo;
    }

    private String makeToken(){
        return UUID.randomUUID().toString();
    }
}
