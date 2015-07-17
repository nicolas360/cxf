package com.zhuc.cxf.t1.restful;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by ZHUC on 2015/7/15.
 */
public class HelloInInterceptor extends AbstractPhaseInterceptor<Message> {

    public HelloInInterceptor(String phase) {
        super(phase);
    }

    public HelloInInterceptor() {
        super(Phase.RECEIVE);
    }

    public void handleMessage(Message message) throws Fault {
        HttpServletRequest request = (HttpServletRequest) message.get(AbstractHTTPDestination.HTTP_REQUEST);
        System.out.println("请求的字符集编码  " + request.getCharacterEncoding());
        System.out.println("请求的URL  " + request.getRequestURL());

//      try {
//          request.setCharacterEncoding("unicode");
//      } catch (UnsupportedEncodingException e1) {}

        String ip = request.getRemoteAddr();
        System.out.println(request.getRequestURI());

        Enumeration<String> e = request.getHeaderNames();
        while (e.hasMoreElements()) {
            String str = e.nextElement();
            System.out.println(str + "   " + request.getHeader(str));
        }
        System.out.println(ip);
//      XMLFault xmlFault=new XMLFault("异常");
//      xmlFault.setStatusCode(4000);
//      xmlFault.setMessage("wrong user and password");
//
//      if(true)
//          throw new Fault(xmlFault);

//      System.out.println("****************************进入拦截器*********************************************");
//      System.out.println(message);
//
//      if (message.getDestination() != null) {
//          System.out.println(message.getId() + "#"+message.getDestination().getMessageObserver());
//      }
//      if (message.getExchange() != null) {
//          System.out.println(message.getExchange().getInMessage() + "#"+ message.getExchange().getInFaultMessage());
//          System.out.println(message.getExchange().getOutMessage() + "#"+ message.getExchange().getOutFaultMessage());
//      }
//      System.out.println("**************************离开拦截器**************************************");
    }
}