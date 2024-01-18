package ru.damon.springstudents.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import ru.damon.springstudents.model.Student;
import ru.damon.springstudents.repository.InMemoryStudentDAO;
import ru.damon.springstudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentService implements StudentService {
    private  final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }


    @Override
    public Student saveStudent(Student student) {

        return repository.safeStudent(student);
    }

    @Override
    public Student findByEmail(String email) {

        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {

        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(@PathVariable String email) {
        repository.deleteStudent(email);

    }
}
