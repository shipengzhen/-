package com.sj6;

public class RunThread implements Runnable {

	private int meters=1000;//����1000��
	private int count=0;
	@Override
	public void run() {
		while (true) {
			if(p()){
				break;
			}
		}
	}
	
	public synchronized boolean p(){
		count++;
		if(meters<=100){
			return true;
		}
		System.out.println(Thread.currentThread().getName()+"�õ���������");
		for (int i = 0; i <100; i+=10) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			System.out.println(Thread.currentThread().getName()+"����"+(i+10)+"�ף�");
			System.out.println(count+"ѡ����"+"����"+(i+10)+"�ף�");
		}
		if(Thread.currentThread().getName().equals("1��ѡ��")){
	    	   return true;
		}
		if(Thread.currentThread().getName().equals("2��ѡ��")){
	    	   return true;
		}
		if(Thread.currentThread().getName().equals("3��ѡ��")){
	    	   return true;
		}
		if(Thread.currentThread().getName().equals("4��ѡ��")){
	    	   return true;
		}
		if(Thread.currentThread().getName().equals("5��ѡ��")){
	    	   return true;
		}
		meters-=100;	
		return false;
	}
}
