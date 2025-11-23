package com.ct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

//        ApplicationContext context =
//            new ClassPathXmlApplicationContext("App.xml");
    	
    	
ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        System.out.println("---- Doctor Bean (Setter Injection) ---- Java based config ");
        Doctor doctor = context.getBean("doctor", Doctor.class);
        doctor.assist();
        System.out.println("Name: " + doctor.getName());
        System.out.println("Qualification: " + doctor.getQualification());
        System.out.println("Experience: " + doctor.getExperience() + " years");

        System.out.println("\n---- Nurse Bean (Field Injection) ---- Java based config");
        Nurse nurse = context.getBean("nurse", Nurse.class);
        nurse.assist();
    }
}
