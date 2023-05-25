package com.joaopmazzo.studentrestapiddd.domain;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private Long id;

    @NotNull
    private String street;

    @NotNull
    private City city;

    @NotNull
    private Country country;

    @NotNull
    private State state;

    public Address(String street, City city, Country country, State state) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.state = state;
    }

}
