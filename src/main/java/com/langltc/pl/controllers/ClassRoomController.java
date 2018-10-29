package com.langltc.pl.controllers;

import com.langltc.pl.models.ClassRoom;
import com.langltc.pl.models.Section;
import com.langltc.pl.models.Student;
import com.langltc.pl.repositories.ClassRoomRepository;
import com.langltc.pl.repositories.SectionRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

/**
 * @author Issam As-sahal ISA
 * @Created 6:59 PM
 **/

@RestController
@RequestMapping("/api/v1/classRoom")
@Log
public class ClassRoomController {
    final
    ClassRoomRepository classRoomRepository;

    @Autowired
    public ClassRoomController(ClassRoomRepository classRoomRepository) {
        this.classRoomRepository = classRoomRepository;
    }


    @GetMapping(path = {"/", ""} /*, produces = "application/json"*/)
    public ResponseEntity<List<ClassRoom>>  getClassRoom() {
        log.info("List all the class rooms");
        List<ClassRoom> classRoomRepositoryAll = classRoomRepository.findAll();
        return new ResponseEntity<>(classRoomRepositoryAll, HttpStatus.OK);
    }


    @GetMapping(path = "/id/{id}")
    public ResponseEntity<Optional<ClassRoom>> getClassRoomById(@PathVariable long id) {
        log.info("Search for class room by id");
        Optional<ClassRoom> classRoom = classRoomRepository.findById(id);
        return new ResponseEntity<>(classRoom, HttpStatus.OK);
    }

    @GetMapping(path = "/name/{name}")
    public Optional<ClassRoom> getClassRoomByName(@PathVariable String name) {
        log.info("Search for class room by name");
        return classRoomRepository.findByNameIgnoreCase(name);
    }

    @GetMapping(path = "/sectionId/{sectionId}")
    public Optional<ClassRoom> getStudentByLastName(@PathVariable long sectionId) {
        log.info("Search for class room by section ");
        return classRoomRepository.findBySectionId(sectionId);
    }


    @GetMapping(path = "/count")
    public long getClassRoomCount() {
        log.info("Count all the class room");
        return classRoomRepository.count();
    }

    @PostMapping(path = "/")
    public ResponseEntity<ClassRoom> addClassRoom(@Valid @RequestBody ClassRoom classRoom) {
        log.info("Add class room");
        ClassRoom classRoom1 = classRoomRepository.save(classRoom);
        return new ResponseEntity<>(classRoom1, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> DeleteClassRoom(@PathVariable long id) {
        log.info("Delete class room");
        classRoomRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
