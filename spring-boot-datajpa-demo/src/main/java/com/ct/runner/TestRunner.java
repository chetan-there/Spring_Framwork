package com.ct.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.ct.entity.Employee;
import com.ct.repository.EmployeeRepository;
import org.springframework.data.domain.*;

@Component
public class TestRunner implements CommandLineRunner {

    private final EmployeeRepository repo;

    // Constructor Injection
    public TestRunner(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        System.out.println("------ Spring Boot Data JPA Demo Started ------");

        // ============= CREATE =============
        repo.save(new Employee(null, "Chetan", "IT", 50000.0));
        repo.save(new Employee(null, "Raj", "HR", 45000.0));
        repo.save(new Employee(null, "Maya", "Finance", 60000.0));
        repo.save(new Employee(null, "Arjun", "IT", 55000.0));

        System.out.println("✅ Data Saved!");

        // ============= READ =============
        System.out.println("\nAll Employees:");
        repo.findAll().forEach(System.out::println);

        // Custom finder
        System.out.println("\nFind by Department (IT):");
        repo.findByDept("IT").forEach(System.out::println);

        // ============= UPDATE =============
        Employee emp = repo.findByName("Raj");
        emp.setSalary(48000.0);
        repo.save(emp);  // save() updates if ID exists
        System.out.println("\nUpdated Employee: " + repo.findById(emp.getId()).get());

        // ============= DELETE =============
        repo.deleteById(1L);
        System.out.println("\nAfter Deletion:");
        repo.findAll().forEach(System.out::println);

        // ============= PAGINATION =============
        Pageable pageable = PageRequest.of(0, 2, Sort.by("salary").descending());
        Page<Employee> page = repo.findAll(pageable);
        System.out.println("\nPaginated Result (Page 1):");
        page.getContent().forEach(System.out::println);

        System.out.println("------ Demo Complete ------");
    }
}
