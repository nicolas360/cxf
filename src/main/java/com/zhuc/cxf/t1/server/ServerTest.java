package com.zhuc.cxf.t1.server;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.zhuc.cxf.t1.Constants;

public class ServerTest {

	public static void main(String[] args) {
		ServerTest st = new ServerTest();
		st.publish1();
		//		st.publish2();

		System.out.println("已发布到: " + Constants.address);
	}

	public void publish1() {
		// 第一种发布方式
		IHelloServices hello = new HelloServicesImpl();
		// 创建WebServices服务接口
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		// 注册webservices接口
		factory.setServiceClass(IHelloServices.class);
		// 发布接口
		factory.setAddress(Constants.address);
		factory.setServiceBean(hello);
		// 创建服务
		factory.create();
	}

	public void publish2() {
		// 第二种发布方式
		Endpoint.publish(Constants.address, new HelloServicesImpl());
	}

}
