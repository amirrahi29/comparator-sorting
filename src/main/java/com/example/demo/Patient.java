package com.example.demo;

public class Patient {


    private String name;
    private PatientType type;
    private String walkInTime;

    public Patient(String name, PatientType type, String walkInTime) {
        this.name = name;
        this.type = type;
        this.walkInTime = walkInTime;
    }

    public String getName() {
        return name;
    }

    public PatientType getType() {
        return type;
    }

    public String getWalkInTime() {
        return walkInTime;
    }
}
