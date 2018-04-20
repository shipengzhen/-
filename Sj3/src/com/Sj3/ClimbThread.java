package com.Sj3;

public class ClimbThread extends Thread {

	private int time=0;//时间
	private int zlc=1000;//总路程
	public int sd;//速度
	
	
	
	
	public ClimbThread(int sd, String name) {
		super(name);
		this.sd = sd;
	}




	@Override
	public void run() {
		while (zlc>sd*time) {
			time++;
			System.out.println("时间"+time);
		}
		System.out.println(Thread.currentThread().getName()+"到达终点");
	}

}
