package com.joaopmazzo.studentrestapiddd.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;

    @NotEmpty
    @Size(min = 10, max = 100)
    private String name;

    @NotEmpty
    private String birthDate;

    @NotEmpty(message = "E-mail must have a value")
    @Size(min = 10, max = 50)
    private String email;

    @NotNull
    private Address address;

    public Student(String name, String birthDate, String email, Address address) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
    }

}
