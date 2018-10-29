package com.langltc.pl.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Issam As-sahal ISA
 * @Created 3:12 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@testPaperId")
@Table(name = "testPaper", schema = "public")
public class TestPaper {

     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    private  Long testPaperId;
    private String name;
    private double duration;
    private Long teacherId;
    private  Long courseId;


    @OneToMany(mappedBy = "testPaper")
    private List<TestWriteByStudent> students=new ArrayList<>();


}
