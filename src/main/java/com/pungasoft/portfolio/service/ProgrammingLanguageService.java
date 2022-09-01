package com.pungasoft.portfolio.service;

import com.pungasoft.portfolio.model.entity.Person;
import com.pungasoft.portfolio.model.entity.ProgrammingLanguage;
import com.pungasoft.portfolio.repository.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageService {
    @Autowired
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.findAll();
    }

    public ProgrammingLanguage getById(Long id) {
        return programmingLanguageRepository.findById(id).orElse(null);
    }

    public List<ProgrammingLanguage> getAllByPersonId(Long personId) {
        return programmingLanguageRepository.findAllByPersonId(personId);
    }
    public ProgrammingLanguage save(ProgrammingLanguage p) {
        return programmingLanguageRepository.save(p);
    }

    public void deleteById(Long id) {
        programmingLanguageRepository.deleteById(id);
    }
}
