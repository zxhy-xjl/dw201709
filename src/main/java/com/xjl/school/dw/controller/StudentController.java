package com.xjl.school.dw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjl.school.dw.domain.Student;
import com.xjl.school.dw.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@ResponseBody
	@RequestMapping(value="/query",method=RequestMethod.GET,consumes = "application/json")
	public List<Student> query(HttpServletRequest request){
		return this.studentService.selectAll();
	}
	@ResponseBody
	@RequestMapping(value="/add",method=RequestMethod.POST,consumes = "application/json")
	public XJLResponse add(HttpServletRequest request, @RequestBody Student student){
		this.studentService.insert(student);
		return XJLResponse.successInstance();
	}
}
