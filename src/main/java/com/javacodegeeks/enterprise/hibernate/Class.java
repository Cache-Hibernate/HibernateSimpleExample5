package com.javacodegeeks.enterprise.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Class implements java.io.Serializable{
	

	private Integer classID;
	
	private String title;
	private String semester;
	
	private Set<Student> assignedStudents = new HashSet<Student>(0);
	

    public Class(){
    }

	public Class(String title, String semester){
		this.title = title;
		this.semester = semester;
	}
	

	

	public Integer getClassID() {
		return classID;
	}




	public void setClassID(Integer classID) {
		this.classID = classID;
	}




	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}


	public Set<Student> getAssignedStudents() {
		return assignedStudents;
	}


	public void setAssignedStudents(Set<Student> assignedStudents) {
		this.assignedStudents = assignedStudents;
	}



	private static final long serialVersionUID = 1L;

	

}
