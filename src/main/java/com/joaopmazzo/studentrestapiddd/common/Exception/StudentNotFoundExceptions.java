package com.joaopmazzo.studentrestapiddd.common.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundExceptions extends Exception {
    public StudentNotFoundExceptions(Long id) {
        super("Student not found with ID "+id);
    }
}
