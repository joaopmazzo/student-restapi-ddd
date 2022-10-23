package com.joaopmazzo.studentrestapiddd.infra.converter;

import com.joaopmazzo.studentrestapiddd.domain.Country;
import com.joaopmazzo.studentrestapiddd.infra.model.CountryModel;
import com.joaopmazzo.studentrestapiddd.rest_interface.dto.request.CountryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    @Mapping(source = "country", target = "country")
    CountryModel toModel(Country country);
    Country toEnity(CountryModel countryModel);

}
