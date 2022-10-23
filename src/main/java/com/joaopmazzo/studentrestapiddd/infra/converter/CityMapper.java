package com.joaopmazzo.studentrestapiddd.infra.converter;

import com.joaopmazzo.studentrestapiddd.domain.City;
import com.joaopmazzo.studentrestapiddd.infra.model.CityModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mapping(source = "city", target = "city")
    CityModel toModel(City city);
    City toEntity(CityModel cityModel);
}
