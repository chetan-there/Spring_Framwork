package com.ct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext context =
            new ClassPathXmlApplicationContext("App.xml");
    	
    	
ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfig.class);

        System.out.println("---- Doctor Bean (Setter Injection) ---- Annotations based config ");
        Doctor doctor = context1.getBean("doctor", Doctor.class);
        doctor.assist();
        System.out.println("Name: " + doctor.getName());
        System.out.println("Qualification: " + doctor.getQualification());
        System.out.println("Experience: " + doctor.getExperience() + " years");

        System.out.println("\n---- Nurse Bean (Field Injection) ---- Annotations Java based config");
        Nurse nurse = context1.getBean("nurse", Nurse.class);
        nurse.assist();
    }
}
