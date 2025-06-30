package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.ioc.service.HelloService;

import static org.assertj.core.api.Assertions.assertThat;

public class AwareInterfaceTest {

	@Test
	public void test() throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
		HelloService helloService = applicationContext.getBean("helloService", HelloService.class);
		assertThat(helloService.getApplicationContext()).isNotNull();
		System.out.println(helloService.getApplicationContext());
		assertThat(helloService.getBeanFactory()).isNotNull();
		System.out.println(helloService.getBeanFactory());
	}
}
