package com.sj4;

public class Test {

	public static void main(String[] args) {
		Thread thread=new MyThread();
		System.out.println("��ʾĬ�����ȼ�");
		System.out.println("���߳���:"+Thread.currentThread().getName()+","+Thread.currentThread().getPriority());
		System.out.println("���߳���:"+thread.getName()+","+thread.getPriority());
		
		
		Thread.currentThread().setPriority(10);
		thread.setName("�ҵ��߳�");
		thread.setPriority(1);
		System.out.println("��ʾ�޸ĺ����ȼ�");
		System.out.println("���߳���:"+Thread.currentThread().getName()+","+Thread.currentThread().getPriority());
		System.out.println("���߳���:"+thread.getName()+","+thread.getPriority());

	}
}
