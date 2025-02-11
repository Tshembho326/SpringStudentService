package com.MyFirstApp.Student.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return arg -> {
            Student tshembho = new Student(21, "xivambuntshembo@gmail.com",
                    "Tshembho Xivambu", LocalDate.of(2003, Month.OCTOBER,12));
            Student rhulani = new Student(21, "tshembho326@gmail.com",
                    "Rhulani Xivambu", LocalDate.of(2003, Month.OCTOBER,12));
            repository.saveAll(List.of(tshembho,rhulani));
        };
    }
}
