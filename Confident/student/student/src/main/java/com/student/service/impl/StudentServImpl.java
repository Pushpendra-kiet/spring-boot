package com.student.service.impl;

import com.student.entities.Result;
import com.student.entities.Student;
import com.student.repo.StudentRepository;
import com.student.service.ResultClient;
import com.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServImpl implements StudentService {

    StudentRepository studentRepository;
    ResultClient resultClient;

    public StudentServImpl(StudentRepository studentRepository, ResultClient resultClient) {
        this.studentRepository = studentRepository;
        this.resultClient = resultClient;
    }

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long studentId) {
        Student student=this.studentRepository.findById(studentId).orElseThrow(()->new RuntimeException("Can't Store Student!!!"));
        List<Result> results=this.resultClient.getStudentResultsById(student.getId());
        student.setResults(results);
        //System.out.println("#################I AM IN##############3");
        return student;
    }

    @Override
    public Student getStudent(Long id) {
        return this.studentRepository.findById(id).orElseThrow(()->new RuntimeException("Can't Store Student!!!"));
    }

    @Override
    public Student addStudent(Student student) {
        return this.studentRepository.save(student);
    }
}
