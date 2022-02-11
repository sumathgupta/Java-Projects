package com.zensar.training.bean;

import java.util.Iterator;
import java.util.List;

public class LengthCoutingRunnable implements Runnable {

	List<String> list;
	public int sum=0;

	public LengthCoutingRunnable(List<String> list) {
		super();
		this.list=list;
	
	}
	
	@Override
	public void run() {
		synchronized (list) {
		Iterator<String> it=list.iterator();
		
		int sum=0;
		while(it.hasNext()) {
			String str=it.next();
			sum=sum+str.length();
			}
		//System.out.println("The length sum :"+sum);
	}

}
}	
