package com.evregent.CoreJava.DAO.StudentApplication;

public class StudentBean {
private String studentName;
private int studentId;
private int studentMarks;
private String grade;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public int getStudentMarks() {
	return studentMarks;
}
public void setStudentMarks(int studentMarks) {
	this.studentMarks = studentMarks;
}
public void setGrade(String grade) {
	this.grade=grade;
}
public String getGrade() {
	return grade;
}

}
