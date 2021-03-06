package com.zensar.training.ui;

import com.zensar.training.bean.Executable;

public class Main3 {

	public static void main(String[] args) {
		Executable executable;
		executable = new Executable() {

			@Override
			public void execute() {
				System.out.println("Hello");
			}
		};

		executable.execute();
		executable = () -> {
			System.out.println("Welcome to Lambda");
		};
		executable.execute();

		executable = () -> {
			System.out.println("Learning Lambda");
		};
		executable.execute();
	}
}
