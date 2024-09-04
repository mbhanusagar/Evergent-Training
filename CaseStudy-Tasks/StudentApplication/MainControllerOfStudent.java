package com.evregent.CoreJava.DAO.StudentApplication;

import java.util.Scanner;

public class MainControllerOfStudent {
public static void main(String[] args) {
	String name;
	int id;
	int marks;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter student name");
	 name=sc.next();
	System.out.println("enter student id");
	 id=sc.nextInt();
	System.out.println("enter student marks");
	marks=sc.nextInt();
	StudentService s=new StudentService();
	int rep=s.gradeToStudentMarks(name, id, marks);
	System.out.println(rep);
	
}
}
