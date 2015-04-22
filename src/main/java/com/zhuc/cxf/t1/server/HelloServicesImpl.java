package com.zhuc.cxf.t1.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebService;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * @author zhuc
 * @create 2013-12-16 上午9:04:35
 */
@WebService(endpointInterface = "com.zhuc.cxf.t1.server.IHelloServices")
public class HelloServicesImpl implements IHelloServices {

	public ArrayList<String> getHelloWords() {
		String[] words = { "hello ", "cxf" };
		return Lists.newArrayList(words);
	}

	public HashMap<String, String> sayHello(String name) {
		HashMap<String, String> map = Maps.newHashMap();
		map.put("name", name + "-cxf");

		return map;
	}

	/* (non-Javadoc)
	 * @see com.zhuc.cxf.t1.IHelloServices#createUser(java.lang.String, java.lang.Integer)
	 */
	public User createUser(String name, Integer age, List<String> hobbys) {
		return new User(name, age, hobbys);
	}

	/* (non-Javadoc)
	 * @see com.zhuc.cxf.t1.IHelloServices#createUser(com.zhuc.cxf.t1.User)
	 */
	public User createUser2(User u) {
		return u;
	}

}
