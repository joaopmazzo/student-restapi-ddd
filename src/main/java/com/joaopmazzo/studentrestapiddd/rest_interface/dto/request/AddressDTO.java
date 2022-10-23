package com.joaopmazzo.studentrestapiddd.rest_interface.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
public class AddressDTO {

    private Long id;

    private String street;

    private String cityId;

    private String countryId;

    private String stateId;

}
