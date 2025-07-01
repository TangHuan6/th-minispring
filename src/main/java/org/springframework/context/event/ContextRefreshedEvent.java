package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * @author th
 * @date 2025/6/30
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

	public ContextRefreshedEvent(ApplicationContext source) {
		super(source);
	}
}
