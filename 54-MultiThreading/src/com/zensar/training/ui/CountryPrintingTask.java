package com.zensar.training.ui;

public class CountryPrintingTask implements Runnable{

	@Override
	public void run() {
		String countryNames[]= {"India","german","france","usa"};
		for(String country:countryNames) {
			Thread temp=Thread.currentThread();
			String name=temp.getName();
			
			System.out.println("\t\t" + name +" : "+country);
		}
	}

}
