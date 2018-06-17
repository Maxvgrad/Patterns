package org.study.entities.person;

import org.study.entities.specialities.Speciality;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private static Integer idCounter = 0;
    private String name;
    private Integer id;
    private LocalDate dateOfBirth;
    private Speciality speciality;

    public Person(String name) {
        this(name, LocalDate.MIN, Speciality.NO_SPESIALITY);
    }

    public Person(String name, LocalDate dateOfBirth) {
        this(name, dateOfBirth, () -> System.out.println("No job spesioality"));
    }

    public Person(String name, LocalDate dateOfBirth, Speciality speciality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = idCounter++;
        this.speciality = speciality;
    }

    public static Integer getIdCounter() {
        return idCounter;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public static void setIdCounter(Integer idCounter) {
        Person.idCounter = idCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = Objects.requireNonNullElse(dateOfBirth, LocalDate.MIN);
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = Objects.requireNonNullElse(speciality, Speciality.NO_SPESIALITY);
    }
}
