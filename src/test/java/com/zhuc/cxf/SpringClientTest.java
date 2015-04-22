package com.zhuc.cxf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhuc.cxf.t1.server.IHelloServices;

public class SpringClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		IHelloServices service = (IHelloServices) ac.getBean("userWsClient");
		System.out.println(service.getHelloWords());
	}

}
