package com.kttkpm_13_09;

import com.kttkpm_13_09.entity.Student;
import com.kttkpm_13_09.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Kttkpm1309ApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void addStudent() {
        studentRepository.save(Student.builder().lName("Phuoc").fName("Truong Phuoc").email("abc@gmail.com").build());
    }

    @Test
    List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    @Test
    void update() {
        studentRepository.save(Student.builder().id(1).lName("Phuoc").fName("Truong Dinh").email("abc@gmail.com").build());
    }

    @Test
    void deleteStudent(){
        studentRepository.deleteById(1);
    }

}
