package com.sl;

public class ThreadDemo {
	
	public static void main(String[] args) {
//		Thread thread=Thread.currentThread();
//		System.out.println("��ǰ�߳��ǣ�"+thread.getName());
//		thread.setName("spz");
//		System.out.println("��ǰ�߳��ǣ�"+thread.getName());
		
		
		
		Thread myThread=new MyThread();
		myThread.start();
		Thread myRunnable=new Thread(new MyRunnable());
		myRunnable.start();
	}
}