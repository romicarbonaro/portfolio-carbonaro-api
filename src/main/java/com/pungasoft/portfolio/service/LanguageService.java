package com.pungasoft.portfolio.service;

import com.pungasoft.portfolio.model.entity.Language;
import com.pungasoft.portfolio.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> getAll() {
        return languageRepository.findAll();
    }

    public List<Language> getAllByPersonId(Long id) {
        return languageRepository.findAllByPersonId(id);
    }

    public Language getById(Long id) {
        return languageRepository.findById(id).orElse(null);
    }

    public Language save(Language p) {
        return languageRepository.save(p);
    }

    public void deleteById(Long id) {
        languageRepository.deleteById(id);
    }
}
