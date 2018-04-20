package com.bz5;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qk qk=new Qk();
		for (int i = 0; i <5; i++) {
			new Thread(qk,"张三").start();
			new Thread(qk,"张三的妻子").start();
		}
	}

}
