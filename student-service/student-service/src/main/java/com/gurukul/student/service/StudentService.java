package com.gurukul.student.service;

import com.gurukul.student.VO.Department;
import com.gurukul.student.VO.ResponseTemplateVO;
import com.gurukul.student.entity.Student;
import com.gurukul.student.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Student saveStudent(Student student) {
        log.info("Inside saveStudent of Student Service ");

        return studentRepository.save(student);
    }

    public ResponseTemplateVO getStudentWithDepartment(Long studentId) {
        log.info("Inside getStudentWithDepartment of Student Service ");
        ResponseTemplateVO vo = new ResponseTemplateVO();
         Student student = studentRepository.findByStudentId(studentId);
        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + student.getDepartmentId()
                        ,Department.class);
        vo.setStudent(student);
        vo.setDepartment(department);
        return vo;

    }
}
