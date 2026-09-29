package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("One",PatientType.NORMAL,"10:00 AM"));
        patients.add(new Patient("Two",PatientType.PREFERRED,"10:15 AM"));
        patients.add(new Patient("Three",PatientType.PREFERRED,"10:30 AM"));
        patients.add(new Patient("Four",PatientType.NORMAL,"10:45 AM"));

        patients.sort(new PatientComparator());

        int slot = 1;
        for(Patient patient: patients){
            System.out.println(
                    "Name: "+patient.getName()+", Slot: "+slot
            );
            slot++;
        }

    }
}
