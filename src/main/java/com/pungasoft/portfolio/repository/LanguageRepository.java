package com.pungasoft.portfolio.repository;

import com.pungasoft.portfolio.model.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {
    List<Language> findAllByPersonId(Long personId);
}
