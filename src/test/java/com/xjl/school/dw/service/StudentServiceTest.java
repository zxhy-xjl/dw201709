package com.xjl.school.dw.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xjl.school.dw.domain.Student;
import com.xjl.school.dw.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:ApplicationContext-*.xml"})
public class StudentServiceTest {
	@Autowired
	private StudentService studentService;
	@Test
	public void testInsert(){
		Student student = new Student();
		student.setStudentName("测试");
		student.setStudentNo(1);
		student.setStudentSex(Student.SEX_男);
		this.studentService.insert(student);
	}
	@Test
	public void testSelectAll(){
		List<Student> list = this.studentService.selectAll();
		for (Student student : list) {
			System.out.println("id:" + student.getStudentId() + " no:" + student.getStudentNo() + " name:" + student.getStudentName() + " sex:" + student.getStudentSex());
		}
	}
}
