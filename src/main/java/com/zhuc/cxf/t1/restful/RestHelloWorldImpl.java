package com.zhuc.cxf.t1.restful;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by ZHUC on 2015/7/15.
 */
public class RestHelloWorldImpl implements RestHelloWorld {

    public String say(String name) {

        System.out.println(name + ", welcome");
        return name + ", welcome you.";
    }

    public List<User> getUser(String id) {
        List<User> list = Lists.newArrayList();

        User user = new User();
        user.setId(id);
        user.setName("chen");
        list.add(user);

        User user1 = new User();
        user1.setId(id);
        user1.setName("chen shi");
        list.add(user1);

        User user2 = new User();
        user2.setId(id);
        user2.setName("chen shi cheng");
        list.add(user2);
        return list;
    }

    public String login(String name, String ps) {
        return "name: " + name + ", password:" + ps;
    }

    public Result login2(String id, String name) {
        System.out.println(id+","+name);
        Result r = new Result();
        r.setFlag("Y");
        r.setMessage("123");

        return r ;
    }

    public Result login3(String id, String name) {
        System.out.println(id+","+name);
        Result r = new Result();
        r.setFlag("N");
        r.setMessage("123");

        return r ;
    }

    public Result login4(String id, User2 user) {
        System.out.println(id);
        System.out.println(user.toString());
        Result r = new Result();
        r.setFlag("N");
        r.setMessage("123");

        return r ;
    }
}
