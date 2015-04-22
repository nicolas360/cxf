package com.zhuc.cxf.t1;

public interface Constants {

	String address = "http://localhost:8090/helloServices";
	String wsdl = address + "?wsdl";
	String targetNamespace = "http://server.t1.cxf.zhuc.com/";
	String serviceName = "IHelloServicesService";
	String portName = "IHelloServicesPort";
}
