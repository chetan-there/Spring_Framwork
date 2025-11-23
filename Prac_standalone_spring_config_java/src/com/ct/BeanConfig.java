package com.ct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Marks this as a Java-based Spring config class
public class BeanConfig {

    // 🩺 Bean for Doctor
    @Bean
    public Doctor doctor() {
        Doctor doc = new Doctor();
        doc.setName("Dr. Chetan There");
        doc.setQualification("MBBS, MD");
        return doc;
    }

    // 🧑‍⚕️ Bean for Nurse
    @Bean
    public Nurse nurse() {
        Nurse nurse = new Nurse();
        nurse.setName("Priya");
        nurse.setExperience(3);
        return nurse;
    }
}
