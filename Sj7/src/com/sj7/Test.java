package com.sj7;

public class Test {

	public static void main(String[] args) {
		Qp qp=new Qp();
		new Thread(qp,"������").start();
		new Thread(qp,"��ţ��").start();
		new Thread(qp,"��ƱƱ").start();
	}

}
