package com.langltc.pl.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Issam As-sahal ISA
 * @Created 3:28 PM
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "section", schema = "public")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sectionId;
    private String name;
    private int classNumber;

}
