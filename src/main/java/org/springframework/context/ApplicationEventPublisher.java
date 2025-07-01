package org.springframework.context;

/**
 * 事件发布者接口
 *
 * @author th
 * @date 2025/6/30
 */
public interface ApplicationEventPublisher {

	/**
	 * 发布事件
	 * @param event
	 */
	void publishEvent(ApplicationEvent event);
}
