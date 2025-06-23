package org.springframework.beans;

import org.springframework.beans.factory.BeanFactory;

import java.util.Map;

/**
 *
 * @author th
 * @date 2025/6/23
 */
public interface ListableBeanFactory extends BeanFactory {

	/**
	 * 返回指定类型的所有实例
	 *
	 * @param type
	 * @param <T>
	 * @return
	 * @throws BeansException
	 */
	<T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

	/**
	 * 返回定义的所有bean的名称
	 *
	 * @return
	 */
	String[] getBeanDefinitionNames();
}
