package com.Sj3;

public class Test {

	public static void main(String[] args) {
		ClimbThread youngThread=new ClimbThread(50,"������");
		ClimbThread oldThread=new ClimbThread(20,"������");
		youngThread.start();
		oldThread.start();
	}

}
