package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author th
 * @date 2025/7/1
 */
public interface MethodMatcher {

	boolean matches(Method method, Class<?> targetClass);
}
