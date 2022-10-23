package com.joaopmazzo.studentrestapiddd.infra.repository.model;

import com.joaopmazzo.studentrestapiddd.infra.model.StateModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateModelRepository extends JpaRepository<StateModel, Long> {
    StateModel getById(Long cityId);
}
