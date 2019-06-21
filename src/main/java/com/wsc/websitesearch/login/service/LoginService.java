package com.wsc.websitesearch.login.service;

import com.wsc.websitesearch.login.dao.LoginDao;
import com.wsc.websitesearch.login.model.LoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;

    @Transactional
    public LoginInfo login(LoginInfo loginInfo) {
        loginInfo.setToken(makeToken());
        loginDao.updateToken(loginInfo);
        return loginInfo;
    }

    private String makeToken() {
        return UUID.randomUUID().toString();
    }
}
