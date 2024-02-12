package com.student.service;

import com.student.entities.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudent(Long id);

    Student addStudent(Student student);

    Student getStudentById(Long id);
}
