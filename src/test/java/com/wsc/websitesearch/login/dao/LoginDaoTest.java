package com.wsc.websitesearch.login.dao;

import com.wsc.websitesearch.WebsiteSearchApplicationTests;
import com.wsc.websitesearch.login.model.LoginInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginDaoTest extends WebsiteSearchApplicationTests {

    @Autowired
    LoginDao loginDao;

    @Test
    public void updateToken() {
        LoginInfo loginInfo = new LoginInfo();
        loginDao.updateToken(loginInfo);
    }
}
