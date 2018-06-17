package org.study.entities.specialities;

@FunctionalInterface
public interface Speciality {
    Speciality NO_SPESIALITY = () -> {
        System.out.printf("No spesiality");
    };
    void doJob();
}
