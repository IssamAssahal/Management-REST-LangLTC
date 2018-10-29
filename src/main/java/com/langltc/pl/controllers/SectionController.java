package com.langltc.pl.controllers;

import com.langltc.pl.models.Section;
import com.langltc.pl.repositories.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @author Issam As-sahal ISA
 * @Created 6:59 PM
 **/

@RestController
@RequestMapping("/Section")
public class SectionController {
    final
    SectionRepository sectionRepository;

    @Autowired
    public SectionController(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    @RequestMapping("/getSection")
    public List<Section> getEmployee(){
        return sectionRepository.findAll() ;
    }

}
