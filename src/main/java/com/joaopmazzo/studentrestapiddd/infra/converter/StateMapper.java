package com.joaopmazzo.studentrestapiddd.infra.converter;

import com.joaopmazzo.studentrestapiddd.domain.State;
import com.joaopmazzo.studentrestapiddd.infra.model.StateModel;
import com.joaopmazzo.studentrestapiddd.rest_interface.dto.request.StateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StateMapper {

    StateMapper INSTANCE = Mappers.getMapper(StateMapper.class);

    @Mapping(source = "state", target = "state")
    StateModel toModel(State state);
    State toEntity(StateModel stateModel);

}
