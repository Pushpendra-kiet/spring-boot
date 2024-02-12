package com.student.controller;

import com.student.entities.Result;
import com.student.entities.Student;
import com.student.service.ResultClient;
import com.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    StudentService studentService;
    ResultClient resultClient;

    public StudentController(StudentService studentService, ResultClient resultClient) {
        this.studentService = studentService;
        this.resultClient = resultClient;
    }

    @GetMapping
    List<Student> getAllStudents()
    {
        return this.studentService.getAllStudents();
    }

    @PostMapping
    Student addStudent(@RequestBody Student student)
    {
        return this.studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    Student getStudentById(@PathVariable Long id)
    {
            return this.studentService.getStudentById(id);
    }



}
