package com.langltc.pl.repositories;

import com.langltc.pl.models.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Issam As-sahal ISA
 * @Created 6:58 PM
 **/
@Repository
public interface SectionRepository extends JpaRepository<Section,Long> {


}
