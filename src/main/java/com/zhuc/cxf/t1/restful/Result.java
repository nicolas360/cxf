package com.zhuc.cxf.t1.restful;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by ZHUC on 2015/7/15.
 */
@XmlRootElement(name = "Result")
public class Result {

    private String flag;

    private String message;

    @XmlElement(name = "Flag")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @XmlElement(name = "Message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
