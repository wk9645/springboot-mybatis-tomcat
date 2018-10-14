package com.wk.demo1.controller;

import com.wk.demo1.pojo.Student;
import com.wk.demo1.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    @RequestMapping("/saveStudent")
    public Object saveStudent(){
        Student s = new Student();
        s.setId(2);
        s.setName("翁凯");
        s.setAge(22);
        iStudentService.saveStudent(s);
        return "保存成功！";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "你好！";
    }

}
