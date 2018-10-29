package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import javax.persistence.*;

/**
 * @author Issam As-sahal ISA
 * @Created   3:23 PM
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "classRoom", schema = "public")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long classRoomId;
    private Long sectionId;
    private String name;
    private int capacity;

    public void displayCourse() {
    }
}
