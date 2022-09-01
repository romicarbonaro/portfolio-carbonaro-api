package com.pungasoft.portfolio.service;

import com.pungasoft.portfolio.model.entity.JobExperience;
import com.pungasoft.portfolio.model.entity.Person;
import com.pungasoft.portfolio.repository.JobExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobExperienceService {
    @Autowired
    private JobExperienceRepository jobExperienceRepository;

    public List<JobExperience> getAll() {
        return jobExperienceRepository.findAll();
    }

    public List<JobExperience> getAllByPersonId(Long personId) {
        return jobExperienceRepository.findAllByPersonId(personId);
    }

    public JobExperience getById(Long id) {
        return jobExperienceRepository.findById(id).orElse(null);
    }

    public JobExperience save(JobExperience p) {
        return jobExperienceRepository.save(p);
    }

    public void deleteById(Long id) {
        jobExperienceRepository.deleteById(id);
    }
}