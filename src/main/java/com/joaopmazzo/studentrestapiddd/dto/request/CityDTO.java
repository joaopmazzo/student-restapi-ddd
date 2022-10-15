package com.joaopmazzo.studentrestapiddd.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityDTO {

    private Long id;

    @NotEmpty
    @Size(min = 4, max = 100)
    private String city;

}
