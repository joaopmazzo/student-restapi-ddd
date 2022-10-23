package com.joaopmazzo.studentrestapiddd.infra.repository.model;

import com.joaopmazzo.studentrestapiddd.infra.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentModelRepository extends JpaRepository<StudentModel, Long> {
}
