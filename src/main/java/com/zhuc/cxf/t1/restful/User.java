package com.zhuc.cxf.t1.restful;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 用于返回xml和json(需要配置json provider)
 * Created by ZHUC on 2015/7/15.
 */
@XmlRootElement(name = "user")
public class User {
    private String id;
    private String name;

    @XmlElement(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}