package com.MyFirstApp.Student.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudent() {
        return List.of(new Student(1L,21, "xivambuntshembo@gmail.com ",
                "Tshembho326", LocalDate.of(2003, 10, 12)));
    }
}
