package org.springframework.aop;

/**
 * @author th
 * @date 2025/7/1
 */
public interface Pointcut {

	ClassFilter getClassFilter();

	MethodMatcher getMethodMatcher();
}