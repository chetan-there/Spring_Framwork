package com.ct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {

    // 🧠 FIELD INJECTION — Spring injects these values automatically

    @Value("Nurse Priya")
    private String name;

    @Value("3")
    private int experience;

    @Value("Emergency")
    private String department;

    @Value("Night")
    private String shiftTime;

    @Override
    public void assist() {
        System.out.println(name + " (Nurse) is assisting in " + department + " department.");
        System.out.println("Experience: " + experience + " years");
        System.out.println("Shift Time: " + shiftTime);
    }
}
