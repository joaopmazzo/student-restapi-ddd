package com.joaopmazzo.studentrestapiddd.rest_interface.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

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
