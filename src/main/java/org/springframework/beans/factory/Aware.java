package org.springframework.beans.factory;

/**
 * 标记类接口，实现该接口能感知容器类接口
 * ① Aware 接口的作用
 * 核心理念：
 * Spring IoC 容器在实例化 Bean 之后，需要让 Bean 知道一些容器内部的信息，比如：
 *
 * 当前 ApplicationContext (整个容器上下文)
 *
 * 自己的 BeanName
 *
 * 接口定义（以 ApplicationContextAware 为例）：
 * public interface ApplicationContextAware {
 *     void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
 * }
 * 你的 Bean 只要实现这个接口，Spring 就会在合适的时机回调 setApplicationContext()，把容器对象传进来。
 * 这个回调不是在构造函数执行期间完成的，而是通过 BeanPostProcessor 在初始化回调里完成的。
 *
 *
 **/
public interface Aware {

}
