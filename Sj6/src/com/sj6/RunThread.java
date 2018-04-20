package com.sj6;

public class RunThread implements Runnable {

	private int meters=1000;//共跑1000米
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
		System.out.println(Thread.currentThread().getName()+"拿到接力棒！");
		for (int i = 0; i <100; i+=10) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			System.out.println(Thread.currentThread().getName()+"跑了"+(i+10)+"米！");
			System.out.println(count+"选号手"+"跑了"+(i+10)+"米！");
		}
		if(Thread.currentThread().getName().equals("1号选手")){
	    	   return true;
		}
		if(Thread.currentThread().getName().equals("2号选手")){
	    	   return true;
		}
		if(Thread.currentThread().getName().equals("3号选手")){
	    	   return true;
		}
		if(Thread.currentThread().getName().equals("4号选手")){
	    	   return true;
		}
		if(Thread.currentThread().getName().equals("5号选手")){
	    	   return true;
		}
		meters-=100;	
		return false;
	}
}
