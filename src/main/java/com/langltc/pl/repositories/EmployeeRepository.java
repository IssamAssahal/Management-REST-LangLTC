package com.langltc.pl.repositories;


import com.langltc.pl.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Issam As-sahal ISA
 * @Created 6:50 PM
 **/
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
