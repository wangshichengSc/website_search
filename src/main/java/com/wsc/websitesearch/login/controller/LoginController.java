package com.wsc.websitesearch.login.controller;

import com.wsc.websitesearch.login.model.LoginInfo;
import com.wsc.websitesearch.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("/api/interceptorTest")
    public void interceptorTest(HttpServletRequest request){
        System.out.println("in method interceptor");
    }

    @GetMapping("/api/hello")
    public Object hello(){
        Map map = new HashMap();
        map.put("hello","hello world");
        return map;
    }
}
