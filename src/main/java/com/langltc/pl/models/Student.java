package com.langltc.pl.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import lombok.extern.java.Log;
import org.hibernate.annotations.Where;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Issam As-sahal ISA
 * @Created 2:22 PM
 **/

@Data
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Log
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@studentId")
@Table(name = "student", schema = "public")
//@Where()
public class Student extends SchoolMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private Long teacherId;

    //simple validation
    @NotNull(message = "Student level is required")
    private String level;
    @NotNull(message = "Student register date is required")
    private LocalDate registerDate;
    @NotNull(message = "Student finish date is required")
    private LocalDate finishDate;

    @OneToMany(mappedBy = "student")
    private List<TestWriteByStudent> testPapers = new ArrayList<>();


    @OneToOne
    private Course course;


    public Student() {

    }

    @Builder
    public Student(long studentId, String firstName, String middleName, String lastName, int age, String address, String phoneNumber, String email, String level, LocalDate registerDate, LocalDate finishDate, Course course) {
        super(firstName, middleName, lastName, age, address, phoneNumber, email);
        this.studentId = studentId;
        this.level = level;
        this.registerDate = registerDate;
        this.finishDate = finishDate;
        this.course = course;
    }


    public boolean stillEnrolled(LocalDate finishDate) {
        LocalDate today = LocalDate.now();
        if (finishDate.isBefore(today)) {
            log.info("Not Enrolled he finished his course");
            return false;
        } else {
            log.info(" Still Enrolled he/she does not finish his/her course yet");
            return true;
        }
    }

    public void fillAdmissionForm() {
    }

    public void writeExam() {
    }

    public double totalScore(List<TestPaper> score, double count) {
        return count;
    }
}
