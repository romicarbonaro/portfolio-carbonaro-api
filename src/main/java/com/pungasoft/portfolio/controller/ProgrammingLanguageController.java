package com.pungasoft.portfolio.controller;

import com.pungasoft.portfolio.model.entity.ProgrammingLanguage;
import com.pungasoft.portfolio.service.ProgrammingLanguageService;
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
@RequestMapping(path = "/programming-languages")
@CrossOrigin("*")
public class ProgrammingLanguageController {
    @Autowired
    private ProgrammingLanguageService programmingLanguageService;

    @GetMapping
    public ResponseEntity<List<ProgrammingLanguage>> getAll() {
        return new ResponseEntity<>(programmingLanguageService.getAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ProgrammingLanguage> getById(@PathVariable Long id) {
        return new ResponseEntity<>(programmingLanguageService.getById(id), HttpStatus.OK);
    }

    @GetMapping(params = "personId")
    public ResponseEntity<List<ProgrammingLanguage>> getByPersonId(@RequestParam Long personId) {
        return new ResponseEntity<>(programmingLanguageService.getAllByPersonId(personId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProgrammingLanguage> create(@RequestBody ProgrammingLanguage programmingLanguage) {
        return new ResponseEntity<>(programmingLanguageService.save(programmingLanguage), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ProgrammingLanguage> edit(@RequestBody ProgrammingLanguage programmingLanguage) {
        return new ResponseEntity<>(programmingLanguageService.save(programmingLanguage), HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        programmingLanguageService.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
