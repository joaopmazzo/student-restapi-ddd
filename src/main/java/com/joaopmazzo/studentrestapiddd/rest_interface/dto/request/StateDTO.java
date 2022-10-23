package com.joaopmazzo.studentrestapiddd.rest_interface.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class StateDTO {

    private Long id;

    private String state;

}
