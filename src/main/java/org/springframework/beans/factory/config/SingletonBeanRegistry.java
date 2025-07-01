package org.springframework.beans.factory.config;

/**
 * 单例注册表 负责管理单例对象（单例池）。
 *
 * @author th
 * @date 2025/6/22
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);

}
