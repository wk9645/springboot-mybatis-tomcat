package com.wk.demo1.service;

import com.wk.demo1.pojo.Student;

import java.util.List;

public interface IStudentService {

    public void saveStudent(Student student);

    public void updateStudent(Student student);

    public void deleteStudent(int id);

    public Student queryStudentById(int id);

    public List<Student> queryStudents();
}
