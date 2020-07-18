package com.yzh.test;

import java.io.Serializable;

import com.sun.accessibility.internal.resources.accessibility;

import sun.font.EAttribute;

/**
 * 
 * @author yang
 *  java郡符  Class   Method Field Constructor
 */
@SuppressWarnings("serial")
public class Apple implements Serializable{
	public String aNmae;
	protected String aPassword;
	Integer age ;
	private Double price;
	public String getaNmae() {
		return aNmae;
	}
	public void setaNmae(String aNmae) {
		this.aNmae = aNmae;
	}
	public String getaPassword() {
		return aPassword;
	}
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Apple [aNmae=" + aNmae + ", aPassword=" + aPassword + ", age=" + age + ", price=" + price + "]";
	}
	public Apple(String aNmae, String aPassword, Integer age, Double price) {
		super();
		this.aNmae = aNmae;
		this.aPassword = aPassword;
		this.age = age;
		this.price = price;
	}
	public Apple() {
		// TODO Auto-generated constructor stub
	}
	
	public void  eat(){
		System.out.println("eat apple。。。。。");
	}
	
	
	
	
}
