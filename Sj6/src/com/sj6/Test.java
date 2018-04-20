 package com.sj6;

public class Test {
	public static void main(String[] args) {
		RunThread run = new RunThread();
		for (int i = 0; i <5; i++) {
			new Thread(run,(i+1)+"ºÅÑ¡ÊÖ").start();
		}
	}
}
