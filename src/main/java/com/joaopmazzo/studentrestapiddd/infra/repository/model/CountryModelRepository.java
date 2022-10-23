package com.joaopmazzo.studentrestapiddd.infra.repository.model;

import com.joaopmazzo.studentrestapiddd.infra.model.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryModelRepository extends JpaRepository<CountryModel, Long> {
    CountryModel getById(Long cityId);
}
