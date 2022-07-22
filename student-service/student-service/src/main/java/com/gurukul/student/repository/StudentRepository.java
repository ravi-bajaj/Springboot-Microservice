package com.gurukul.student.repository;

import com.gurukul.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByStudentId(Long studentId);
}
