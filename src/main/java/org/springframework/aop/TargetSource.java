package org.springframework.aop;

/**
 * @author tanghuan
 * @date 2025/7/2
 */

public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }
    public Class<?>[] getTargetClasses() {
        return target.getClass().getInterfaces();
    }
    public Object getTarget() {
        return target;
    }
}
