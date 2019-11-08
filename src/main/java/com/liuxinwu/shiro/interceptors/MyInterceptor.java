package com.liuxinwu.shiro.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor  implements HandlerInterceptor {

    private Logger log = LoggerFactory.getLogger(MyInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {
        log.info("MyInterceptor preHandle方法，在请求方法之前调用，Controller方法调用之前");
        System.out.println("每个Controller方法之前执行这段拦截器方法 ..");

        // 返回true才能继续执行
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView)
            throws Exception {
        log.info("MyInterceptor postHandler方法，请求处理之后调用，但是在视图被渲染之前（Controller方法调用之后）");
        System.out.println("每个Controller方法之后执行这段拦截器方法 ..");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        log.info("MyInterceptor afterCompletion方法，在整个请求结束之后调用，也就是在Dispatcher渲染了整个视图之后进行"
                + "主要进行资源清理工作");
    }

}
