package com.ct;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {

    private String name;
    private String qualification;
    private int experience;

    public void assist() {
        System.out.println(name + " (Doctor) is assisting");
    }

    // --- Setter Injection ---
    public void setName(String name) {
        this.name = name;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // --- Getters for display ---
    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public int getExperience() {
        return experience;
    }
}
 