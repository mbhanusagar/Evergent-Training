package com.evergent.CoreJava.WrapperClasses;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer i1=new Integer(a);
		System.out.println(i1);
		int a1=i1.intValue();
		System.out.println(a1);
		
		float b=10;
		Float i2=new Float(b);
		System.out.println(i2);
		float b1=i2.floatValue();
		System.out.println(b1);
		
		double c=10;
		Double i3=new Double(c);
		System.out.println(i3);
		double c1=i3.doubleValue();
		System.out.println(c1);
		
		byte d=10;
		Byte i4=new Byte(d);
		System.out.println(i4);
		int d1=i1.byteValue();
		System.out.println(d1);

	}

}