package com.joaopmazzo.studentrestapiddd.infra.repository.domain;

import com.joaopmazzo.studentrestapiddd.common.Exception.StudentNotFoundExceptions;
import com.joaopmazzo.studentrestapiddd.domain.*;
import com.joaopmazzo.studentrestapiddd.infra.model.StudentModel;
import com.joaopmazzo.studentrestapiddd.rest_interface.dto.request.*;
import com.joaopmazzo.studentrestapiddd.rest_interface.dto.response.MessageResponseDTO;
import com.joaopmazzo.studentrestapiddd.infra.converter.CityMapper;
import com.joaopmazzo.studentrestapiddd.infra.converter.CountryMapper;
import com.joaopmazzo.studentrestapiddd.infra.converter.StateMapper;
import com.joaopmazzo.studentrestapiddd.infra.converter.StudentMapper;
import com.joaopmazzo.studentrestapiddd.infra.repository.model.CityModelRepository;
import com.joaopmazzo.studentrestapiddd.infra.repository.model.CountryModelRepository;
import com.joaopmazzo.studentrestapiddd.infra.repository.model.StateModelRepository;
import com.joaopmazzo.studentrestapiddd.infra.repository.model.StudentModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StudentDomainRepository {

    private StudentModelRepository studentRepository;
    private CityModelRepository cityRepository;
    private CountryModelRepository countryRepository;
    private StateModelRepository stateRepository;

    private final StudentMapper studentMapper = StudentMapper.INSTANCE;
    private final CityMapper cityMapper = CityMapper.INSTANCE;
    private final CountryMapper countryMapper = CountryMapper.INSTANCE;
    private final StateMapper stateMapper = StateMapper.INSTANCE;

    public MessageResponseDTO createStudent(StudentDTO studentDTO) {
        AddressDTO addressDTO = studentDTO.getAddress();

        City city = cityMapper.toEntity(cityRepository.getById(Long.parseLong(addressDTO.getCityId())));
        Country country = countryMapper.toEnity(countryRepository.getById(Long.parseLong(addressDTO.getCountryId())));
        State state = stateMapper.toEntity(stateRepository.getById(Long.parseLong(addressDTO.getStateId())));

        Address address = new Address(addressDTO.getStreet(), city, country, state);
        Student student = new Student(studentDTO.getName(), studentDTO.getBirthDate(), studentDTO.getEmail(), address);

        StudentModel studentToSave = studentMapper.toModel(student);

        StudentModel studentSaved = studentRepository.save(studentToSave);

        return createMessageResponse("Created student with ID: "+studentSaved.getId());
    }

    public List<Student> listAll() {
        List<StudentModel> allStudents = studentRepository.findAll();
        return allStudents.stream()
                .map(studentMapper::toEntity)
                .collect(Collectors.toList());
    }

    public Student findById(Long id) throws StudentNotFoundExceptions {
        StudentModel student = verifyIfExists(id);
        return studentMapper.toEntity(student);
    }



    private MessageResponseDTO createMessageResponse(String message) {
        return MessageResponseDTO.builder().message(message).build();
    }

    private StudentModel verifyIfExists(Long id) throws StudentNotFoundExceptions {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundExceptions(id));
    }

}
