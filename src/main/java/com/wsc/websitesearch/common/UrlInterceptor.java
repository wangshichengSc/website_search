package com.wsc.websitesearch.common;

import com.wsc.websitesearch.login.dao.LoginDao;
import com.wsc.websitesearch.login.model.LoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class UrlInterceptor implements HandlerInterceptor {
    @Autowired
    private LoginDao loginDao;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("------" + request.getContextPath());
        /*
        验证token有效性，前期先存放在session中，对比数据库里的token
        以后会放在redis里，从request请求参数里获取被对比的token
         */
        HttpSession session = request.getSession();
        LoginInfo loginInfo = (LoginInfo) session.getAttribute("loginInfo");
        if (loginInfo == null) {
            response.sendRedirect(request.getContextPath() + "/");
            return false;
        }
        String token = loginInfo.getToken();
        String db_token = loginDao.queryToken(loginInfo.getLoginName());
        if (db_token.equals(token)) {
            return true;
        }
        response.sendRedirect(request.getContextPath() + "/");
        return false;
    }
}
