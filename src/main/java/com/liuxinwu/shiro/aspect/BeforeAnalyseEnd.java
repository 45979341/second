package com.liuxinwu.shiro.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 日志打印
 */
@Aspect
@Component
public class BeforeAnalyseEnd {

    @Pointcut("execution(* com.liuxinwu.shiro.controller.*.*(..))")
    public  void itemAspect(){}

    @Before("itemAspect()")
    public void beforeExec(JoinPoint point){
        Class<?> aClass = point.getTarget().getClass();
        Logger logger = LoggerFactory.getLogger(aClass);
        logger.info("{},项点解析开始",aClass.getSimpleName());
        System.out.println("sssss");
    }

    @After("itemAspect()")
    public void afterExec(JoinPoint point){
        Class<?> aClass = point.getTarget().getClass();
        Logger logger = LoggerFactory.getLogger(aClass);
        logger.info("{},项点解析结束",aClass.getSimpleName());
        System.out.println("bbbbb");
    }


}
