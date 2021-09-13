package com.kttkpm_13_09.service;



import com.kttkpm_13_09.entity.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List<Student> getAllStudent();
    void updateStudent(Student student);
    void deleteStudent(int id);
}
