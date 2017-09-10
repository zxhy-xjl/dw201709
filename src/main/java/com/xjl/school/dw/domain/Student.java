package com.xjl.school.dw.domain;

import com.xjl.school.annotation.TableDB;

@TableDB(name="xjl_dw_student")
public class Student {
	//学生id
	private String studentId;
	//学生名称
	private String studentName;
	//学生学号
	private int studentNo;
	//学生性别
	private String studentSex;
	public static final String SEX_男="男";
	public static final String SEX_女="女";
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentSex() {
		return studentSex;
	}
	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}
	
}
