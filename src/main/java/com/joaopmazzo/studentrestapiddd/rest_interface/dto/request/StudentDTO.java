package com.joaopmazzo.studentrestapiddd.rest_interface.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class StudentDTO {

    private Long id;

    private String name;

    private String birthDate;

    private String email;

    private AddressDTO address;

}
