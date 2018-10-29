package com.langltc.pl.controllers;

import com.langltc.pl.models.TestPaper;
import com.langltc.pl.repositories.TestPaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Issam As-sahal ISA
 * @Created  On 10/21/2018 1:21 PM
 **/
@RestController
@RequestMapping(path = "api/v1/testPaper")
public class TestPaperController {
    final
    TestPaperRepository  testPaperRepository;

    @Autowired
    public TestPaperController(TestPaperRepository testPaperRepository) {
        this.testPaperRepository = testPaperRepository;
    }

    @GetMapping("/allTestPaper")
    public ResponseEntity<List<TestPaper>> getAllTest(){
        return new ResponseEntity<>(testPaperRepository.findAll(), HttpStatus.OK);
    }
}
