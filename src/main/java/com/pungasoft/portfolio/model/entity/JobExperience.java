package com.pungasoft.portfolio.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class JobExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idJobExperience")
    private Long id;

    @Column(length = 30, nullable = false)
    private String company;

    @Column(length = 30, nullable = false)
    private String position;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDate startDate;

    private LocalDate endDate;

    @ManyToOne()
    private Person person;
}