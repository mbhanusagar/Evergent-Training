package com.evergent.CoreJava.WrapperClasses;

import java.util.ArrayList;

import com.evergent.CoreJava.Inhertence.NewBook;

public class WrapperClass_AutoBoxingDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Auto Boxing
		int a=10;
		Integer a1=new Integer(a);
		ArrayList arrayList=new ArrayList();
		arrayList.add(a1);
		arrayList.add(new Integer(100));
		System.out.println(arrayList);
		
		// jdk 1.5
		
		ArrayList a2=new ArrayList<>();
		a2.add(500);
		System.out.println(a2.get(0));
		
	}

}