package com.sj5;

public class Test {
	
	public static void main(String[] args) {
		Thread txThread=new Thread(new Tx(),"�����");
		Thread ptThread=new Thread(new Pt(),"��ͨ��");
		txThread.start();
		ptThread.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
