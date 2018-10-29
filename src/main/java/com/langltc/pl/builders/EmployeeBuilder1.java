package com.langltc.pl.builders;



import com.langltc.pl.models.Employee;

import java.time.LocalDate;

/**
 * @author Issam As-sahal ISA
 * @Created 12:19 AM
 **/

public class EmployeeBuilder1 {


    private Long id;
    private String department;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;
    private float baseSalary;
    private float workingHours;
    private float bonus;
    private LocalDate hiredDate;

    public EmployeeBuilder1 setId(long id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder1 setDepartment(String department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder1 setfirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder1 setmiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public EmployeeBuilder1 setlastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder1 setAge(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder1 setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder1 setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public EmployeeBuilder1 setEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder1 setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
        return this;
    }

    public EmployeeBuilder1 setWorkingHours(float workingHours) {
        this.workingHours = workingHours;
        return this;
    }

    public EmployeeBuilder1 setBonus(float bonus) {
        this.bonus = bonus;
        return this;
    }

    public EmployeeBuilder1 setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
        return this;
    }

    public Employee build() {
        return new Employee(id, department, firstName, middleName, lastName, age, address, phoneNumber, email, baseSalary, workingHours, bonus, hiredDate);
    }


}
