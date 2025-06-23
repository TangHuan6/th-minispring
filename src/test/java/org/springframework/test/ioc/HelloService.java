package org.springframework.test.ioc;

/**
 * @author th
 * @date 2025/6/22
 */
public class HelloService {

	public String sayHello() {
		System.out.println("hello");
		return "hello";
	}
}
