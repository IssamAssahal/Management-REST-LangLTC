package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;

/**
 * @author Issam As-sahal ISA
 * @Created 7:35 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class SchoolMember {

    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected int age;
    protected String address;
    protected String phoneNumber;
    protected String email;

}
