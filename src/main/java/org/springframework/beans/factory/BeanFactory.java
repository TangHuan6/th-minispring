package org.springframework.beans.factory;


import org.springframework.beans.BeansException;

/**
 * bean容器
 *
 *
 * @author th
 * @date 2025/6/22
 */
public interface BeanFactory {

	/**
	 * 获取bean IOC 容器的基本能力：通过 beanName 获取对象。
	 *
	 * @param name
	 * @return
	 */
	Object getBean(String name);

	Object getBean(String name, Object... args) throws BeansException;
}
