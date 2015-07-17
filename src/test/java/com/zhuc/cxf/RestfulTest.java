package com.zhuc.cxf;

import com.google.common.collect.Maps;
import com.zhuc.cxf.t1.restful.HttpProxy4;
import com.zhuc.cxf.t1.restful.User;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by ZHUC on 2015/7/15.
 */
public class RestfulTest {

    public static void main(String[] args) throws IOException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        RestTemplate restTemplate = new RestTemplate();

//        String s1 = restTemplate.getForObject("http://localhost:8080/cxf/services/restful/getUser/ss", String.class);
//        System.out.println(s1);
//
//        Map<String, Object> map = Maps.newHashMap();
//        map.put("id", 222);
//        String s2 = restTemplate.getForObject("http://localhost:8080/cxf/services/restful/getUser/{id}", String.class, map);
//        System.out.println(s2);
//
//        map = Maps.newHashMap();
//        map.put("id", "123213");
//        map.put("name", "asdsad");
//        String s3 = restTemplate.getForObject("http://localhost:8080/cxf/services/restful/login2/{id}?name={name}", String.class, map);
//        System.out.println(s3);
//
//
//        map = Maps.newHashMap();
//        map.put("id", "555");
//        map.put("name", "888");
//        s3 = restTemplate.postForObject("http://localhost:8080/cxf/services/restful/login3/{id}?name={name}", null,  String.class, map);
//        System.out.println(s3);

        HttpProxy4 proxy = new HttpProxy4();
        String s1 = proxy.accessGet("http://localhost:8080/cxf/services/restful/login2/asd?name=zhuc");
        System.out.println(s1);

        Map<String, String> map = Maps.newHashMap();
        map.put("name", "阿什顿");
        proxy = new HttpProxy4();
        s1 = proxy.accessPost("http://localhost:8080/cxf/services/restful/login3/qwe", map);
        System.out.println(s1);

        proxy = new HttpProxy4();
        User u = new User();
        u.setName("user1");
        u.setId("123123213");
        s1 = proxy.accessPost("http://localhost:8080/cxf/services/restful/login4/qwe", u);
        System.out.println(s1);

    }
}
