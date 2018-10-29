package com.langltc.pl.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Issam As-sahal ISA
 * @Created 8:27 PM
 **/
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employee", schema = "public")
public class Employee extends SchoolPiadMember implements CalculateHoursSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String department;
    private String email;

    public Employee(){}
    @Builder
    public Employee(Long employeeId, String department, String firstName, String middleName, String lastName, int age, String address, String phoneNumber, String email, float baseSalary, float workingHours, float bonus, LocalDate hiredDate) {
        super(firstName, middleName, lastName, age, address, phoneNumber, email, baseSalary, workingHours, bonus, hiredDate);
        this.employeeId = employeeId;
        this.department = department;
    }


    @Override
    public float calculateMonthlyFinialSalary() {
        return 0;
    }

    @Override
    public float calculateMonthlyWorkingHours() {
        return 0;
    }
}
