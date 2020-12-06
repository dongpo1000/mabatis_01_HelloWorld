package com.pywl.entity;

/**
 * @Description 员工实体 tb_employee
 * @Author DongPo
 * @Date 2020-12 20:11
 */
public class Employee {
	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 性别 1男 2女
	 */
	private String gender;

	/**
	 * 邮件地址
	 */
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee{" +
			"id=" + id +
			", userName='" + userName + '\'' +
			", gender='" + gender + '\'' +
			", email='" + email + '\'' +
			'}';
	}
}
