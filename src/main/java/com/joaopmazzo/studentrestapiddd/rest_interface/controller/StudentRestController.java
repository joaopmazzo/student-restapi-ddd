package com.joaopmazzo.studentrestapiddd.rest_interface.controller;

import com.joaopmazzo.studentrestapiddd.common.Exception.StudentNotFoundExceptions;
import com.joaopmazzo.studentrestapiddd.infra.repository.domain.StudentDomainRepository;
import com.joaopmazzo.studentrestapiddd.rest_interface.dto.request.StudentDTO;
import com.joaopmazzo.studentrestapiddd.rest_interface.dto.response.MessageResponseDTO;
import com.joaopmazzo.studentrestapiddd.domain.Student;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StudentRestController {

    private StudentDomainRepository studentService;

    @PostMapping
    public MessageResponseDTO createStudent(@RequestBody @Valid StudentDTO studentDTO) {
        return studentService.createStudent(studentDTO);
    }

    @GetMapping
    public List<Student> listAll() {
        return studentService.listAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id) throws StudentNotFoundExceptions {
        return studentService.findById(id);
    }

}
