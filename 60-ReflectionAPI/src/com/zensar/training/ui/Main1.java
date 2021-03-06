package com.zensar.training.ui;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Student;

public class Main1 {
	static void receive(Object obj) {
		Class objectsClass= obj.getClass();
		System.out.println(objectsClass.getSimpleName());
		Method[] allmethods=objectsClass.getDeclaredMethods();
		for(Method m:allmethods) {
			System.out.println(m.getName());
		}
		
		Field[] allFields=objectsClass.getDeclaredFields();
		
		for(Field field: allFields) {
			System.out.println(field.getName());
		}
		
		Constructor[] constructors=objectsClass.getConstructors();
		for(Constructor c:constructors) {
			System.out.println(c);
		}
		
	}
	
	public static void main(String[] args) {
		Circle circle=new Circle(10);
		Student student=new Student();
		Employee employee=new Employee();
		//receive(circle);
		//receive(employee);
		receive(student);
	}
}
