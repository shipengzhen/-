package com.Sj3;

public class ClimbThread extends Thread {

	private int time=0;//ʱ��
	private int zlc=1000;//��·��
	public int sd;//�ٶ�
	
	
	
	
	public ClimbThread(int sd, String name) {
		super(name);
		this.sd = sd;
	}




	@Override
	public void run() {
		while (zlc>sd*time) {
			time++;
			System.out.println("ʱ��"+time);
		}
		System.out.println(Thread.currentThread().getName()+"�����յ�");
	}

}
