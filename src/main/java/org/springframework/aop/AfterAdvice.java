package org.springframework.aop;

import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

/**
 * 后置增强
 *
 * @author tanghuan
 * @date 2025/7/2
 */
public interface AfterAdvice extends Advice {
    void after(Method method, Object[] args, Object target) throws Throwable;
}
