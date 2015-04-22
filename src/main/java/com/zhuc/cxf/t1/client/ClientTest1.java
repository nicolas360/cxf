package com.zhuc.cxf.t1.client;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.google.common.collect.Lists;
import com.zhuc.cxf.t1.Constants;
import com.zhuc.cxf.t1.server.IHelloServices;
import com.zhuc.cxf.t1.server.User;

/**
 *  Client Proxy
 *  使用JaxWsProxyFactoryBean 类简化Proxy
 * @author zhuc
 * @create 2013-12-13 下午3:06:24
 */
public class ClientTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建WebService客户端代理工厂     
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		//注册WebService接口     
		factory.setServiceClass(IHelloServices.class);
		//设置WebService地址     
		factory.setAddress(Constants.address);
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		IHelloServices iHelloWorld = (IHelloServices) factory.create();

		System.out.println(iHelloWorld.getHelloWords());
		System.out.println(iHelloWorld.sayHello("zhuc"));
		System.out.println(iHelloWorld.createUser("zhuc", 20, Lists.newArrayList(new String[] { "swim", "sing" })));
		System.out.println(iHelloWorld.createUser2(new User("zhuc", 21, Lists.newArrayList(new String[] { "swim",
				"sing" }))));

	}
}
