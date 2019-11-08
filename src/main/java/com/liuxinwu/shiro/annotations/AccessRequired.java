package com.liuxinwu.shiro.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description 在需要登录验证的Controller的方法上使用此注解
 * @Param
 */
@Target(ElementType.METHOD)// 可用在方法名上
@Retention(RetentionPolicy.RUNTIME)// 运行时有效
public @interface AccessRequired {
}
