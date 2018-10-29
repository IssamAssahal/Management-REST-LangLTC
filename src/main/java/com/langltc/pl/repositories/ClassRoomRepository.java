package com.langltc.pl.repositories;

import com.langltc.pl.models.ClassRoom;
import com.langltc.pl.models.Section;
import com.langltc.pl.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Issam As-sahal ISA
 * @Created 6:58 PM
 **/
@Repository
public interface ClassRoomRepository extends JpaRepository<ClassRoom,Long> {
    Optional<ClassRoom> findByNameIgnoreCase(String name);
    Optional<ClassRoom> findBySectionId(long sectionId);


}
