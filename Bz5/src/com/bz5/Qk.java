package com.bz5;

public class Qk implements Runnable {
	private int ye=500;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+"准备取款");
			if (ye<=0) {
				System.out.println("取款失败，余额不足已支付"+Thread.currentThread().getName()+"的取款，余额是："+ye);
				return;
			}
			ye-=100;
			System.out.println(Thread.currentThread().getName()+"完成取款,余额是："+ye);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
