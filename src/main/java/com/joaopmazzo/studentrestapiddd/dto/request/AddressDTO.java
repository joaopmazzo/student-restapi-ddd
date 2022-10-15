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
public class AddressDTO {

    private Long id;

    @NotEmpty
    @Size(min = 10, max = 100)
    private String street;

    @NotEmpty
    private CityDTO cityDTO;

    @NotEmpty
    private CountryDTO countryDTO;

    @NotEmpty
    private StateDTO stateDTO;

}
