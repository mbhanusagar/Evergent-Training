package com.evergent.CoreJava.Beans;
import java.beans.*;
import java.io.Serializable;

public class Employee implements Serializable{
		private int eno;
		private String enoString;
		private double sal;
		public void setEno(int eno) {
			this.eno = eno;
		}
		public int getEno() {
			return eno;
		}
		public void setEnoString(String enoString) {
			this.enoString = enoString;
		}
		public String getEnoString() {
			return enoString;
		}
		public void setSal(double sal) {
			this.sal = sal;
		}
		public double getSal() {
			return sal;
		}
		
		
}