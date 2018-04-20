package com.sl;

public class MyThread extends Thread {

	/**
	 * 重写run()方法
	 */
	public void run() {
		for (int i=1; i <=20; i++) {
			System.out.println("来自线程"+Thread.currentThread().getName()+":"+i);
		}
	}
}
