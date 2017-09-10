package com.xjl.school.dw.service;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjl.school.dw.domain.Student;
import com.xjl.school.dw.mapper.StudentMapper;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;
	public void insert(Student student){
		if (StringUtils.isEmpty(student.getStudentId())){
			student.setStudentId(UUID.randomUUID().toString());
		}
		this.studentMapper.insert(student);
	}
	public List<Student> selectAll(){
		return this.studentMapper.selectAll();
	}
}
