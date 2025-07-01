package org.springframework.context;

import java.util.EventListener;

/**
 * @author th
 * @date 2025/6/30
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

	void onApplicationEvent(E event);
}