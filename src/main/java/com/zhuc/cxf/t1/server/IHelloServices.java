package com.zhuc.cxf.t1.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebService;

/**
 * @author zhuc
 * @create 2013-12-13 下午2:06:21
 */
@WebService
public interface IHelloServices {

	/**
	 * @param name
	 * @param age
	 * @param hobbys 参数中集合可以写接口类型, 而返回值中不允许
	 * @return
	 */
	public User createUser(String name, Integer age, List<String> hobbys);

	/**
	 * 发布时不允许同名方法出现2次, 就算参数不同
	 * @param u
	 * @return
	 */
	public User createUser2(User u);

	/**
	 * WebService返回值的类型不能用接口类型
	 * @return
	 */
	public ArrayList<String> getHelloWords();

	/**
	 * WebService返回值的类型不能用接口类型
	 * @param name
	 * @return
	 */
	public HashMap<String, String> sayHello(String name);
}
