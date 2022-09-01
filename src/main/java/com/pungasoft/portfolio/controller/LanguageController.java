package com.pungasoft.portfolio.controller;

import com.pungasoft.portfolio.model.entity.Language;
import com.pungasoft.portfolio.service.LanguageService;
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
@RequestMapping(path = "/languages")
@CrossOrigin("*")
public class LanguageController {
    @Autowired
    private LanguageService languageService;

    @GetMapping(params = "personId")
    public ResponseEntity<List<Language>> getAllByPersonId(@RequestParam Long personId) {
        return new ResponseEntity<>(languageService.getAllByPersonId(personId), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Language> getById(@PathVariable Long id) {
        return new ResponseEntity<>(languageService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Language> create(@RequestBody Language language) {
        return new ResponseEntity<>(languageService.save(language), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Language> edit(@RequestBody Language language) {
        return new ResponseEntity<>(languageService.save(language), HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        languageService.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
