package org.springframework.beans.factory;

public interface DisposableBean {

    /**
     *  销毁
     * @throws Exception
     */
    void destroy() throws Exception;
}
