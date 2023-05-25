package com.joaopmazzo.studentrestapiddd.domain;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    private Long id;

    @NotEmpty
    @Size(min = 4, max = 100)
    private String country;

}
