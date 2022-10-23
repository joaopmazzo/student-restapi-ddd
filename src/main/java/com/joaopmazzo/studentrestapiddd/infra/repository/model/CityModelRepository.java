package com.joaopmazzo.studentrestapiddd.infra.repository.model;

import com.joaopmazzo.studentrestapiddd.infra.model.CityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityModelRepository extends JpaRepository<CityModel, Long> {
    CityModel getById(Long cityId);
}
