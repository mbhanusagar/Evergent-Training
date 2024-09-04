package com.evregent.CoreJava.DAO.StudentApplication;


public class StudentService {
public int gradeToStudentMarks(String studentName,int studentId,int studentMarks) {
	String grade="";
	if(studentMarks>500&&studentMarks<=600) {
		grade="A";
	}
	else if(studentMarks>400&&studentMarks<=500) {
		grade="B";
	}
	else if(studentMarks>300&&studentMarks<=400) {
		grade="C";
	}
	else grade="D";
	StudentBean s=new StudentBean();
	s.setGrade(grade);
	s.setStudentId(studentId);
	s.setStudentMarks(studentMarks);
	s.setStudentName(studentName);
	StudentDAO sDao=new StudentDAO();
	int result=sDao.gradeAdding(s);
	return 1;
}
}
