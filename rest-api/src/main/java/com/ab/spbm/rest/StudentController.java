package com.ab.spbm.rest;

import com.ab.spbm.model.Student;
import com.ab.spbm.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String home() {
        return "HOME PAGE";
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        return studentRepository.getStudentsFromDb();
    }
}
