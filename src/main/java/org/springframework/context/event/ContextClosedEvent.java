package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * @author th
 * @date 2025/6/30
 */
public class ContextClosedEvent extends ApplicationContextEvent {

	public ContextClosedEvent(ApplicationContext source) {
		super(source);
	}
}
