package com.liuxinwu.shiro.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@Component
@WebFilter(urlPatterns = "/filter/*", filterName = "myFilter")
public class MyFilter implements Filter {

    private Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("我自定义的过滤器起作用了");
        filterChain.doFilter(servletRequest,servletResponse);//一定要放过去
    }
}
