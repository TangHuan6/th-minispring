package org.springframework.context;

import java.util.EventObject;

/**
 * @author th
 * @date 2025/6/30
 */
public abstract class ApplicationEvent extends EventObject {

	public ApplicationEvent(Object source) {
		super(source);
	}
}
