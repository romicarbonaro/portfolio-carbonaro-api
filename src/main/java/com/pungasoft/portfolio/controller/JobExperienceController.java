package com.pungasoft.portfolio.controller;

import com.pungasoft.portfolio.model.entity.JobExperience;
import com.pungasoft.portfolio.service.JobExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/job-experience")
@CrossOrigin("*")
public class JobExperienceController {
    @Autowired
    private JobExperienceService jobExperienceService;

    @GetMapping
    public ResponseEntity<List<JobExperience>> getAll() {
        return new ResponseEntity<>(jobExperienceService.getAll(), HttpStatus.OK);
    }

    @GetMapping(params = "personId")
    public ResponseEntity<List<JobExperience>> getAllByPersonId(@RequestParam Long personId) {
        return new ResponseEntity<>(jobExperienceService.getAllByPersonId(personId), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<JobExperience> getById(@PathVariable Long id) {
        return new ResponseEntity<>(jobExperienceService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<JobExperience> create(@RequestBody JobExperience jobExperience) {
        return new ResponseEntity<>(jobExperienceService.save(jobExperience), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<JobExperience> edit(@RequestBody JobExperience jobExperience) {
        return new ResponseEntity<>(jobExperienceService.save(jobExperience), HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        jobExperienceService.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
