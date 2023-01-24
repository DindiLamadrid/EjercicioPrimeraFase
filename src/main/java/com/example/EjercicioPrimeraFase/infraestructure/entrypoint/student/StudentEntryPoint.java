package com.example.EjercicioPrimeraFase.infraestructure.entrypoint.student;

import com.example.EjercicioPrimeraFase.domain.model.student.dto.StudentDTO;
import com.example.EjercicioPrimeraFase.domain.usecase.student.StudentRepository;
import lombok.AllArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentEntryPoint {
    private final StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<?> saveStudent(StudentDTO studentDTO){
       return ResponseEntity
               .status(HttpStatus.ACCEPTED)
               .body(studentRepository.save(studentDTO));
    }
}
