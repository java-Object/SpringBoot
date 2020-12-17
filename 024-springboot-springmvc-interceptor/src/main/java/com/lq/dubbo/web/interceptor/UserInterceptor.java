package com.lq.dubbo.web.interceptor;

import com.lq.dubbo.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 罗强
 * @create 2020-12-14 10:35
 * @class
 */
public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //如果要跳转，那么判断session中有没有user对象，有就放行，没有就不放行
        User user = (User)request.getSession().getAttribute("user");
        if (user == null){
            System.out.println(user+"-------------------");
            response.sendRedirect(request.getContextPath()+"/err");
            return false;
        }
        System.out.println(user+"====================");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
