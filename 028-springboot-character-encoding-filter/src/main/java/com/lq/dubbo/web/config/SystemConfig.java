package com.lq.dubbo.web.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author 罗强
 * @create 2020-12-14 22:13
 * @class
 */

@Configuration  //将当前类指定为注册类
public class SystemConfig {

    @Bean
    public FilterRegistrationBean characterFilterRegistration() {
        //设置字符编码过滤器
        //CharacterEncoding是由Spring提供的一个字符编码过滤器，之前是配置在web.xml文件之中
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();

        //强制使用指定字符编码
        characterEncodingFilter.setForceEncoding(true);

        //设置指定字符编码
        characterEncodingFilter.setEncoding("UTF-8");

        //创建过滤器注册bean
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        //设置字符编码过滤器
        filterRegistrationBean.setFilter(characterEncodingFilter);

        //设置字符编码过滤器路径
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;

    }

}
