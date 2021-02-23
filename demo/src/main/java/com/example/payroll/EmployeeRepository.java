package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository <Employee, Long> {
    //by extending the JpaRep we can now perform actions on the employees' records
    // the domain type is Employee and the id type is Long
}
