package com.sj5;

public class Kb{

	public static int name=0;
	
	public static synchronized void name(Thread thread){
		name++;
		System.out.println(thread.getName()+":"+name+"ºÅ²¡ÈËÔÚ¿´²¡£¡");
	}
}
