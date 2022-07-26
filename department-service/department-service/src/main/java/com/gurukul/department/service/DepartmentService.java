package com.gurukul.department.service;


import com.gurukul.department.entity.Department;
import com.gurukul.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDeparetment(Department department) {
        log.info("Inside saveDepartment of Department service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById of Department service");
        return departmentRepository.findByDepartmentId(departmentId);
    }

}
