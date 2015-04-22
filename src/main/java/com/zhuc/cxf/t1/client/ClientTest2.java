package com.zhuc.cxf.t1.client;

import com.google.common.collect.Lists;
import com.zhuc.cxf.wsdl2java.t1.IHelloServices;
import com.zhuc.cxf.wsdl2java.t1.IHelloServicesService;

/**
 * 依据wsdl文件生成java客户端，直接调用<br>
 * wsdl2java -p com.zhuc.cxf.wsdl2java.t1 -encoding utf-8 -frontend jaxws21 http://localhost:8090/helloServices?wsdl
 * @author zhuc
 * @create 2013-12-13 下午3:05:51
 */
public class ClientTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IHelloServicesService iHelloServices = new IHelloServicesService();
		IHelloServices services = iHelloServices.getIHelloServicesPort();

		System.out.println(services.getHelloWords());
		System.out.println(services.sayHello("zhuc"));
		System.out.println(services.createUser("zhuc", 20, Lists.newArrayList(new String[] { "swim", "sing" })));

		com.zhuc.cxf.wsdl2java.t1.User user = new com.zhuc.cxf.wsdl2java.t1.User();
		user.setName("name-zhuc22");
		user.setAge(2222);
		System.out.println(services.createUser2(user));

	}

}
