package com.akshay;

public class MyThread extends Thread {

	public void run() {
		System.out.println("MyThread.run()");
	}

	public void start() {
		System.out.println("MyThread.start()");
		super.start();
	}

	public static void main(String[] args) {

		MyThread thread = new MyThread();
		thread.start();

	}

}
