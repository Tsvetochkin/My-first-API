package ru.damon.springstudents.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.damon.springstudents.model.Student;
import ru.damon.springstudents.service.StudentService;

import java.util.List;

@RequestMapping("/api/v1/students")
@RestController
@AllArgsConstructor
public class StudentController {

    @Qualifier("studentService")
    private final StudentService service;
    @GetMapping
    public List<Student> findAllStudents() {
        //todo
        return service.findAllStudents();
    }
@PostMapping("save_students")
    public  String saveStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return "Student successfully saved";
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }
    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }
    @DeleteMapping("delete_student/{email}")
    public void deleteStudent (@PathVariable String email){
        service.deleteStudent(email);
    }
}
