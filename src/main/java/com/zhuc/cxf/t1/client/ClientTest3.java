package com.zhuc.cxf.t1.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.zhuc.cxf.t1.Constants;
import com.zhuc.cxf.t1.server.IHelloServices;

/**
 * JAX-WS Proxy
 * 不需要执行wsdl2java的。但是在编译环境中需要接口类和VO类。
 * 这里，通过指定WSDL_LOCATION和PORT_NAME，使用Service.create创建service，使用service.getPort获得服务引用
 * @author zhuc
 * @create 2013-12-13 下午3:04:56
 */
public class ClientTest3 {

	private static final QName SERVICE_NAME = new QName(Constants.targetNamespace, Constants.serviceName);
	private static final QName PORT_NAME = new QName(Constants.targetNamespace, Constants.portName);

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		URL wsdlURL = new URL(Constants.wsdl);
		Service service = Service.create(wsdlURL, SERVICE_NAME);
		IHelloServices port = service.getPort(PORT_NAME, IHelloServices.class);

		System.out.println(port.getHelloWords());

	}

}
