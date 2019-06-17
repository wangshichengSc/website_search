package com.wsc.websitesearch.login.controller;

import com.wsc.websitesearch.login.model.LoginInfo;
import com.wsc.websitesearch.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Object login(HttpServletRequest request, @RequestParam LoginInfo loginInfo) {
        HttpSession session = request.getSession();
        loginInfo = loginService.login(loginInfo);
        session.setAttribute("loginInfo", loginInfo);
        return null;
    }
}
