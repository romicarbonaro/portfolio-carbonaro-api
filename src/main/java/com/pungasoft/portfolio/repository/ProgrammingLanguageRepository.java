package com.pungasoft.portfolio.repository;

import com.pungasoft.portfolio.model.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
    List<ProgrammingLanguage> findAllByPersonId(Long personId);
}
