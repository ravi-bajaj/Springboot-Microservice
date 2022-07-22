package com.gurukul.department.controller;


import com.gurukul.department.entity.Department;
import com.gurukul.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDepartment (@RequestBody  Department department){
        log.info("Inside saveDepartment method of Department controller");
        return departmentService.saveDeparetment(department);
    }


    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentById method of Department controller");
        return departmentService.findDepartmentById(departmentId);
    }


}
