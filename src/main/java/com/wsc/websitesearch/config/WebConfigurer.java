package com.wsc.websitesearch.config;

import com.wsc.websitesearch.interceptor.UrlInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebConfigurer implements WebMvcConfigurer {
    @Autowired
    private UrlInterceptor urlInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//      注册拦截器，拦截除了登录、注册、忘记密码之外的url
        registry.addInterceptor(urlInterceptor).addPathPatterns("/**")
                .excludePathPatterns("/index.html", "/login", "/error");

    }

}
