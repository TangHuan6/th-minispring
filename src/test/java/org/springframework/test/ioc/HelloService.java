package org.springframework.test.ioc;

/**
 * @author th
 * @date 2025/6/22
 */
public class HelloService {

	private String name;

	public HelloService() {

	}

	public HelloService(String name) {
		this.name = name;
	}

	public String sayHello() {
		System.out.println("hello");
		return "hello";
	}

	public String getName() {
		return name;
	}
}
