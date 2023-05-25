package com.joaopmazzo.studentrestapiddd.infra.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ADDRESS")
public class AddressModel {

    @Id
    @Column(name = "ADDRESS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String street;

    @ManyToOne(fetch = FetchType.LAZY)
    private CityModel city;

    @ManyToOne(fetch = FetchType.LAZY)
    private CountryModel country;

    @ManyToOne(fetch = FetchType.LAZY)
    private StateModel state;

}
