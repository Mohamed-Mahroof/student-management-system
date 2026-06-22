package com.example.student_management_system.service;

import com.example.student_management_system.model.Student;
import com.example.student_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // Add Student
    public Student addStudent(Student student) {
        return  studentRepository.save(student);
    }

    // Get all Students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get Student by ID
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Update Student
    public Student updateStudent(Long id, Student updatedStudent) {
        Student existing = studentRepository.findById(id).orElseThrow(() -> new RuntimeException(("Student not found")));
        existing.setName(updatedStudent.getName());
        existing.setEmail(updatedStudent.getEmail());
        existing.setDepartment(updatedStudent.getDepartment());
        existing.setYear(updatedStudent.getYear());

        return studentRepository.save(existing);
    }

    // Delete Student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
