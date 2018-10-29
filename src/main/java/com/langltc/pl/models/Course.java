package com.langltc.pl.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Issam As-sahal ISA
 * @Created  3:17 PM
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course", schema = "public")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String name;
    private float hoursNumber;
    private float price;
    private Date startDate;
    private Date finishDate;





    public void displayCourse() {
    }

}
