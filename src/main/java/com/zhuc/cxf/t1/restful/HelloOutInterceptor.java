package com.zhuc.cxf.t1.restful;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by ZHUC on 2015/7/15.
 */
public class HelloOutInterceptor extends AbstractPhaseInterceptor<Message> {

    public HelloOutInterceptor(String phase) {
        super(phase);
    }

    public HelloOutInterceptor() {
        super(Phase.SEND);
    }

    public void handleMessage(Message message) throws Fault {
        HttpServletResponse response = (HttpServletResponse) message.get(AbstractHTTPDestination.HTTP_RESPONSE);
        response.setCharacterEncoding("utf-8");
        System.out.println("**************************离开拦截器**************************************");
    }
}