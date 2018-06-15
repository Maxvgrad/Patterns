package org.study.entities.person;

import java.time.LocalDate;

public class Person {
    private static Integer idCounter = 0;
    private String name;
    private Integer id;
    private LocalDate dateOfBirth;
    private Speciality speciality;

    public Person(String name) {
        this.name = name;
        this.id = idCounter++;
    }

    public Person(String name, LocalDate dateOfBirth) {
        this(name);
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, LocalDate dateOfBirth, Speciality speciality) {
        this(name, dateOfBirth);
        this.speciality = speciality;
    }
}
