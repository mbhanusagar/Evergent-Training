package com.evergent.CoreJava.Beans;

public class EmployeeImpl {
		public static void main(String[] args) {
			Employee employee= new Employee();
			employee.setEno(692);
			employee.setEnoString("bhanu");
			employee.setSal(27000);
			
			
			System.out.println("Employee No :"+employee.getEno());
			System.out.println("Employee Name :"+employee.getEnoString());
			System.out.println("Employee Sal :"+employee.getSal());
		}
}