package com.wsc.websitesearch.config;

import com.wsc.websitesearch.common.UrlInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Component
public class WebConfigurer implements WebMvcConfigurer {
    @Autowired
    private UrlInterceptor urlInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> excludePathList = new ArrayList<>();
        excludePathList.add("/");
        excludePathList.add("/login");
        //注册拦截器，拦截除了登录、注册、忘记密码之外的url
        registry.addInterceptor(urlInterceptor).addPathPatterns("/**").excludePathPatterns(excludePathList);
    }

}
