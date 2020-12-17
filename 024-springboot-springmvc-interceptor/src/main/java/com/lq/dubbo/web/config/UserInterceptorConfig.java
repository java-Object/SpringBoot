package com.lq.dubbo.web.config;

import com.lq.dubbo.web.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 罗强
 * @create 2020-12-14 13:38
 * @class
 */
@Configuration
public class UserInterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] addPath = {
                "/user/**"
        };
        String[] excludePath = {
                "/user/login",
                "/user/loginsucess",
        };
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPath).excludePathPatterns(excludePath);
    }
}
