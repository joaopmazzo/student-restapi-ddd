package com.joaopmazzo.studentrestapiddd.domain;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
