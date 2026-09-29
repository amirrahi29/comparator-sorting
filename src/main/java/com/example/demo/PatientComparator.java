package com.example.demo;

import org.springframework.format.datetime.DateFormatterRegistrar;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Locale;

public class PatientComparator implements Comparator<Patient> {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);

    @Override
    public int compare(Patient p1, Patient p2) {

        int comparePriority = Integer.compare(
                getPriority(p1.getType()),
                getPriority(p2.getType())
        );

        if(comparePriority != 0){
            return comparePriority;
        }

        LocalTime date1 = LocalTime.parse(p1.getWalkInTime(),formatter);
        LocalTime date2 = LocalTime.parse(p2.getWalkInTime(),formatter);

        int compareTime = date1.compareTo(date2);
        if(compareTime != 0){
            return compareTime;
        }

        return p1.getName().compareToIgnoreCase(p2.getName());
    }

    public int getPriority(PatientType type){
        if(type == PatientType.PREFERRED){
            return 0;
        }
        return 1;
    }
}
