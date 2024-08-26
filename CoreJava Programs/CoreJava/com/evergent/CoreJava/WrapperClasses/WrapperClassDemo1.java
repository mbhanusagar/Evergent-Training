package com.evergent.CoreJava.WrapperClasses;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Auto Boxing
		int a=10;
		Integer i1=new Integer(a);
		
		//Auto Unboxing
		System.out.println(i1);
		int a1=i1.intValue();
		System.out.println(a1);

	}

}