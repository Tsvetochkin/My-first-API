package ru.damon.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.damon.springstudents.model.Student;

public interface StudentRepository extends JpaRepository <Student, Long > {
    void deleteByEmail (String email);
    Student findByEmail (String email);
}
