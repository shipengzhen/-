package com.sl;

public class MyThread extends Thread {

	/**
	 * ��дrun()����
	 */
	public void run() {
		for (int i=1; i <=20; i++) {
			System.out.println("�����߳�"+Thread.currentThread().getName()+":"+i);
		}
	}
}
