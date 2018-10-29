package com.langltc.pl.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

/**
 * @author Issam As-sahal ISA
 * @Created 8:20 PM
 **/
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class SchoolPiadMember extends SchoolMember {

    protected float baseSalary;
    protected float workingHours;
    protected float bonus;
    protected LocalDate hiredDate;

    public SchoolPiadMember() {
    }

    public SchoolPiadMember(String firstName, String middleName, String lastName, int age,
                            String address, String phoneNumber, String email, float baseSalary,
                            float workingHours, float bonus, LocalDate hiredDate) {
        super(firstName, middleName, lastName, age, address, phoneNumber, email);
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
        this.bonus = bonus;
        this.hiredDate = hiredDate;
    }
}

