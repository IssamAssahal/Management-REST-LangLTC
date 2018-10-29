package com.langltc.pl.repositories;

import com.langltc.pl.models.Student;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;


/**
 * @author Issam As-sahal ISA
 * @Created 1:52 PM
 **/

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional <Student> findByFirstNameIgnoreCase(String name);

    long count();

    Optional<Student> findByLastNameIgnoreCase(String lastName);

    Optional<Student> findByRegisterDate(LocalDate date);

//    @Query("from Student as s, Course as c where s.courseId=c.courseId ORDER BY s.studentId")
//    List<Object> findByCourse();
}
