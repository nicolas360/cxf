package com.zhuc.cxf.t1.server;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author zhuc
 * @create 2013-12-13 下午2:04:15
 */
public class User {

	private String name;

	private Integer age;

	private List<String> hobbys;

	public User() {
		super();
	}

	public User(String name, Integer age, List<String> hobbys) {
		super();
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the hobbys
	 */
	public List<String> getHobbys() {
		return hobbys;
	}

	/**
	 * @param hobbys the hobbys to set
	 */
	public void setHobbys(List<String> hobbys) {
		this.hobbys = hobbys;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
