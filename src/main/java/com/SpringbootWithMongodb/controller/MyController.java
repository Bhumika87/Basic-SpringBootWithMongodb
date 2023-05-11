package com.SpringbootWithMongodb.controller;

import com.SpringbootWithMongodb.models.Student;
import com.SpringbootWithMongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Student")
public class MyController {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
             Student save= this.studentRepository.save(student);
             return ResponseEntity.ok(save);

    }
    @GetMapping("/")
    public ResponseEntity<?> getStudent()
    {

        return ResponseEntity.ok(this.studentRepository.findAll());

    }
}
