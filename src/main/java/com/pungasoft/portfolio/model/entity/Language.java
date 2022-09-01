package com.pungasoft.portfolio.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLanguage")
    private Long id;

    @Column(nullable = false, length = 25)
    private String name;

    @Column(length = 25, nullable = false)
    private String level;

    @Column(length = 20)
    private String certification;

    @ManyToOne
    private Person person;
}