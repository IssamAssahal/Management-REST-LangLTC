package com.langltc.pl.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Issam As-sahal ISA
 * @Created 1:48 PM
 **/

@Data
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "teacher", schema = "public")
public class Teacher extends SchoolPiadMember implements CalculateHoursSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;
    private String level;

    public Teacher() {

    }

    public Teacher(Long teacherId, String firstName, String middleName, String lastName, int age, String address, String phoneNumber, String email, float baseSalary, float workingHours, float bonus, LocalDate hiredDate, String level) {
        super(firstName, middleName, lastName, age, address, phoneNumber, email, baseSalary, workingHours, bonus, hiredDate);
        this.teacherId = teacherId;
        this.level = level;
    }

    public void prepareTestPaper() {
    }

    public void markAttendance() {
    }

    public void checkPapers() {
    }

    public void prepareRecordCards() {
    }

    public void declareResults() {
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
