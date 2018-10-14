package com.wk.demo1.service;

import com.wk.demo1.dao.StudentMapper;
import com.wk.demo1.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iStudentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public void saveStudent(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Student queryStudentById(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Student> queryStudents() {
        return studentMapper.selectAll();
    }
}
