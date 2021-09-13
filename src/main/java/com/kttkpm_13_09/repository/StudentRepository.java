package com.kttkpm_13_09.repository;



import com.kttkpm_13_09.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
