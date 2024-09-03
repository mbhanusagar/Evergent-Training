package com.evergent.CoreJava.ExceptionHandling;

public class ExceptionDemo18_Multiple_Throws {
	String name=null;
	public void myData() throws NullPointerException, ArithmeticException{
		
			
			System.out.println("ONE");
			System.out.println(name.length());
			int k=10/0;
			System.out.println("END");
	}
	
		public static void main(String[] args) {
			try{
				ExceptionDemo3 ed= new ExceptionDemo3(); 
			ed.myData();
		}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("I can handle "+e);
			}
}}
