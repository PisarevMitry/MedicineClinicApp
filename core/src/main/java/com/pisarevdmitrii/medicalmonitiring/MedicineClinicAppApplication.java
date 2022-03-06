package com.pisarevdmitrii.medicalmonitiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.pisarevdmitrii.medicineclinicapp.*")
public class MedicineClinicAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicineClinicAppApplication.class, args);
    }

}
