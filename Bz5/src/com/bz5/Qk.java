package com.bz5;

public class Qk implements Runnable {
	private int ye=500;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+"׼��ȡ��");
			if (ye<=0) {
				System.out.println("ȡ��ʧ�ܣ�������֧��"+Thread.currentThread().getName()+"��ȡ�����ǣ�"+ye);
				return;
			}
			ye-=100;
			System.out.println(Thread.currentThread().getName()+"���ȡ��,����ǣ�"+ye);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
