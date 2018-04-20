package com.sj4;

public class Test {

	public static void main(String[] args) {
		Thread thread=new MyThread();
		System.out.println("显示默认优先级");
		System.out.println("主线程名:"+Thread.currentThread().getName()+","+Thread.currentThread().getPriority());
		System.out.println("子线程名:"+thread.getName()+","+thread.getPriority());
		
		
		Thread.currentThread().setPriority(10);
		thread.setName("我的线程");
		thread.setPriority(1);
		System.out.println("显示修改后优先级");
		System.out.println("主线程名:"+Thread.currentThread().getName()+","+Thread.currentThread().getPriority());
		System.out.println("子线程名:"+thread.getName()+","+thread.getPriority());

	}
}
