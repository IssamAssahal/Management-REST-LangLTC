package com.langltc.pl.repositories;

import com.langltc.pl.models.TestPaper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Issam As-sahal ISA
 * @Created 1:19 PM
 **/
@Repository
public interface TestPaperRepository extends JpaRepository<TestPaper,Long> {
}
