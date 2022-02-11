package com.zensar.training.ui;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.zensar.training.bean.Square;

public class Main4 {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
		Class myClass=Square.class;
		Object obj=myClass.newInstance();
		Method method=myClass.getMethod("setSize",int.class);
		method.invoke(obj, 15);
		Method method2=myClass.getMethod("calculateArea");
		System.out.println(method2.invoke(obj));
	}
}

