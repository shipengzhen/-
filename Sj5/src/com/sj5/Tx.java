package com.sj5;

public class Tx implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Kb.name(Thread.currentThread());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
