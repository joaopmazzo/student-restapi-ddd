package com.joaopmazzo.studentrestapiddd.infra.converter;

import com.joaopmazzo.studentrestapiddd.domain.Student;
import com.joaopmazzo.studentrestapiddd.infra.model.StudentModel;
import com.joaopmazzo.studentrestapiddd.rest_interface.dto.request.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(source = "birthDate", target = "birthDate", dateFormat = "yyyy-MM-dd")
    StudentModel toModel(Student student);

    Student toEntity(StudentModel studentModel);

}
