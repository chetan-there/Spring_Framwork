package com.ct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ct.entity.Employee;

// JpaRepository provides CRUD + Pagination + Sorting
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Custom Finder Methods (Spring Data JPA derives SQL automatically)
    Employee findByName(String name);
    java.util.List<Employee> findByDept(String dept);
}
