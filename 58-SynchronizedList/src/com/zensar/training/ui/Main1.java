package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.zensar.training.bean.LengthCoutingRunnable;
import com.zensar.training.bean.StringAdderRunnable;

public class Main1 {

	public static void main(String[] args)throws InterruptedException {
		List<String> myList=new ArrayList<>();
		myList.add("zensar");
		myList.add("Training");
		
		List<String> syncList=Collections.synchronizedList(myList);
		
		StringAdderRunnable adderRunnable=new StringAdderRunnable(syncList);
		LengthCoutingRunnable coutingRunnable=new LengthCoutingRunnable(syncList);
		
		Thread t1=new Thread(adderRunnable);
		Thread t2=new Thread(coutingRunnable);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(myList);
		System.out.println(coutingRunnable.sum);
	}

}
