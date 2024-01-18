package ru.damon.springstudents.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import ru.damon.springstudents.model.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudents() ;
    Student saveStudent(Student student);
    Student findByEmail (String email);
    Student updateStudent (Student student);
    void deleteStudent (String email);

}
