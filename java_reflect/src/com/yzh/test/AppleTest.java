package com.yzh.test;

import java.lang.reflect.Field;

import org.junit.Test;


public class AppleTest {
	
	@Test
	public void testClass() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException{
		//1获取class对象
		//第一种方式
		Class appleClass=Class.forName("com.yzh.test.Apple");	
		Field f=appleClass.getField("aNmae");
		Object newInstance = appleClass.newInstance();
		f.get(newInstance);
		System.out.println(f.getModifiers());
		System.out.println(f.get(newInstance));
		
		Field[] fields = appleClass.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		Field[] declaredFields = appleClass.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field.getName());
			
		}
	}

}
