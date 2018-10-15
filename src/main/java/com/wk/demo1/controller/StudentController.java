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

    /**
     * 增加一个学生
     * @return
     */
    @RequestMapping("/saveStudent")
    public Object saveStudent(){
        Student s = new Student();
        s.setId(2);
        s.setName("翁凯");
        s.setAge(22);
        iStudentService.saveStudent(s);
        return "保存成功！";
    }

    /**
     * 修改学生属性
     * @return
     */
    @RequestMapping("/updateStudent")
    public Object updateStudent(){
        Student s = new Student();
        s.setId(1);
        s.setName("张帅");
        s.setAge(21);
        iStudentService.updateStudent(s);
        return s;
    }

    /**
     * 根据主键删除学生
     * @return
     */
    @RequestMapping("/deleteStudent")
    public Object deleteStudent(){
        iStudentService.deleteStudent(2);
        return "删除成功";
    }
    /**
     * 根据主键查找学生
     * @return
     */
    @RequestMapping("/queryStudentById")
    public Object queryStudentById(){

        return iStudentService.queryStudentById(1);
    }

    /**
     * 查找所有学生
     * @return
     */
    @RequestMapping("/queryStudents")
    public Object queryStudents(){
        return iStudentService.queryStudents();
    }

    @RequestMapping("/hello")
    public String hello(){
        return "你好！";
    }

}
