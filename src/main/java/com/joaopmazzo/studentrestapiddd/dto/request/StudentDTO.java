package com.joaopmazzo.studentrestapiddd.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private Long id;

    @NotEmpty
    @Size(min = 10, max = 100)
    private String name;

    @NotEmpty
    private String birtDate;

    @NotEmpty
    @Size(min = 10, max = 50)
    private String email;

    @NotEmpty
    private AddressDTO addressDTO;

}
