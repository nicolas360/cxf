package com.zhuc.cxf.t1.restful;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 用于@BeanParam post下的参数封装
 * Created by ZHUC on 2015/7/17.
 */
@XmlRootElement(name = "user")
public class User2 {

    @FormParam("userName")
//    @PathParam("userName") //我觉得这个应该是写错了，FormParam
    private String userName;

    @FormParam("name")
    private String name;

    @FormParam("telephone")
    private String telephone;

    @FormParam("email")
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
