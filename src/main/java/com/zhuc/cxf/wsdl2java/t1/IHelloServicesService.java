package com.zhuc.cxf.wsdl2java.t1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-13T15:55:21.269+08:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "IHelloServicesService", 
                  wsdlLocation = "http://localhost:8090/helloServices?wsdl",
                  targetNamespace = "http://server.t1.cxf.zhuc.com/") 
public class IHelloServicesService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.t1.cxf.zhuc.com/", "IHelloServicesService");
    public final static QName IHelloServicesPort = new QName("http://server.t1.cxf.zhuc.com/", "IHelloServicesPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8090/helloServices?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IHelloServicesService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8090/helloServices?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IHelloServicesService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IHelloServicesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IHelloServicesService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IHelloServices
     */
    @WebEndpoint(name = "IHelloServicesPort")
    public IHelloServices getIHelloServicesPort() {
        return super.getPort(IHelloServicesPort, IHelloServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHelloServices
     */
    @WebEndpoint(name = "IHelloServicesPort")
    public IHelloServices getIHelloServicesPort(WebServiceFeature... features) {
        return super.getPort(IHelloServicesPort, IHelloServices.class, features);
    }

}
