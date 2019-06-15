package com.jm2190309.model;

import java.util.Arrays;

public class User {
	private String name;
	private String password;
	private String email;
	private int age;
	private String gender;
	private String[] courses;
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + ", age=" + age + ", gender="
				+ gender + ", courses=" + Arrays.toString(courses) + ", country=" + country + ", comment=" + comment
				+ ", type=" + type + "]";
	}

	private String country;
	private String comment;
	private String type;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
