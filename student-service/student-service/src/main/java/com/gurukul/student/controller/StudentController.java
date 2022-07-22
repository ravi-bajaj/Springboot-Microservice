package com.gurukul.student.controller;


import com.gurukul.student.VO.ResponseTemplateVO;
import com.gurukul.student.entity.Student;
import com.gurukul.student.service.StudentService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@Slf4j

public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/")
    public Student saveStudent (@RequestBody  Student student){
        log.info("Inside saveStudent of Student Controller ");
        return studentService.saveStudent(student);

    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getStudentWithDepartment(@PathVariable("id") Long studentId){
        return studentService.getStudentWithDepartment(studentId);

    }


}
