package com.sl;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i=1; i <=20; i++) {
			System.out.println("来自线程"+Thread.currentThread().getName()+":"+i);
		}
	}

}
