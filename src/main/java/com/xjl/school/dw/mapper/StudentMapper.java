package com.xjl.school.dw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xjl.school.dw.domain.Student;


@Repository
public interface StudentMapper {
	static final String TABLE_NAME = "xjl_dw_student";
	static final String SELECT_ALL = "student_id as studentId,student_name as studentName,student_no as studentNo,student_sex as studentSex";
	static final String INSERT_FIELD = "student_id,student_name,student_no,student_sex";
	static final String INSERT_VALUE = "#{studentId},#{studentName},#{studentNo},#{studentSex}";
	@Insert("insert into " + TABLE_NAME + "(" + INSERT_FIELD + ") values("+INSERT_VALUE+")")
	public void insert(Student student);
	@Select("select " + SELECT_ALL + " from " + TABLE_NAME)
	public List<Student> selectAll();
}
