package com.pungasoft.portfolio.repository;

import com.pungasoft.portfolio.model.entity.JobExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobExperienceRepository extends JpaRepository<JobExperience, Long> {
    List<JobExperience> findAllByPersonId(Long personId);
}
