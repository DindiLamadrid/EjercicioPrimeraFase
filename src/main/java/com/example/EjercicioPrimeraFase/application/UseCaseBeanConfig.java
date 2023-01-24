package com.example.EjercicioPrimeraFase.application;

import com.example.EjercicioPrimeraFase.domain.model.gateway.ICourseRepository;
import com.example.EjercicioPrimeraFase.domain.model.gateway.IStudentRepository;
import com.example.EjercicioPrimeraFase.domain.usecase.course.CourseRepository;
import com.example.EjercicioPrimeraFase.domain.usecase.student.StudentRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public StudentRepository studentRepository(IStudentRepository iStudentRepository){
        return new StudentRepository(iStudentRepository);
    }

    @Bean
    public CourseRepository courseRepository(ICourseRepository iCourseRepository){
        return new CourseRepository(iCourseRepository);
    }
}
