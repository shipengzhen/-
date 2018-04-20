package com.sj5;

public class Pt implements Runnable {

	@Override
	public void run() {
		Thread txThread=new Thread(new Tx(),"ÌØĞèºÅ");
		try {
			for(int i=0;i<50;i++){
				Kb.name(Thread.currentThread());
				Thread.sleep(500);
				if(i==9){
					txThread.join();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
