package com.evergent.CoreJava.WrapperClasses;

public class WrapperClass_AutoBoxingDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Auto Boxing
		char c='a';
		
		Character myCharacter=new Character(c);
		char ch=myCharacter.charValue();
		System.out.println(ch);
		System.out.println(myCharacter);
	}

}