package com.zensar.training.ui;

public class Main1 {
	public static void main(String[] args) throws InterruptedException {
		Thread t=Thread.currentThread();
		
		Thread t1=new CityPrintingThread();
		t1.setName("City Printing Thread");
		t1.start();
		
		CountryPrintingTask countryPrintingTask=new CountryPrintingTask();
		Thread t2=new Thread(countryPrintingTask);
		t2.setName("Country Printing Task");
		t2.start();
		
		ReverseNumberPrintingThread reverseNumberPrintingThread=new ReverseNumberPrintingThread();
		Thread t3=new Thread(reverseNumberPrintingThread);
		t3.setName("ReverseNumber");
		t3.start();
		
		RangedNumberSumTask rangedNumberSumTask=new RangedNumberSumTask();
		Thread t4=new Thread(rangedNumberSumTask);
		t4.setName("RangedNum : ");
		t4.start();
		
		CircleProcessingThread circleProcessingThread=new CircleProcessingThread();
		circleProcessingThread.setName("Circle");
		circleProcessingThread.start();


		
		
		System.out.println("program Begins");
		for(int i=1;i<=10;i++) {
			System.out.println(t.getName()+" : "+i);
			t.sleep(1000);
		}
		System.out.println("program Ends");
	}
}
