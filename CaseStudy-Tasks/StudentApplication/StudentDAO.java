package com.evregent.CoreJava.DAO.StudentApplication;
import java.util.ArrayList;

import com.evergent.corejava.StudentApplication_LAYERWISE_Architecture.StudentBean;

public class StudentDAO {
public int gradeAdding(StudentBean sb) {
	ArrayList<Object> a=new ArrayList<>();
	a.add(sb.getStudentId());
	a.add(sb.getStudentName());
	a.add(sb.getStudentMarks());
	a.add(sb.getGrade());
	System.out.println(a);
	System.out.println("student name: "+sb.getStudentName());
	System.out.println("student id: "+sb.getStudentId());
	System.out.println("student marks"+sb.getStudentMarks());
	System.out.println("student grade"+sb.getGrade());
	return 1;
}
}
