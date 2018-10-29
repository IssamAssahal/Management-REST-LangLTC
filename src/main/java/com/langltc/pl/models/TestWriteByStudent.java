package com.langltc.pl.models;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Issam As-sahal ISA
 * @Created 8:50 PM
 **/
@Data
@Builder
@Entity
@Table(name = "testWriteByStudent", schema = "public")
public class TestWriteByStudent {
    @Data
    @Embeddable
    public static class TestWriteByStudentId implements Serializable {

        @Column(name = "fk_student")
        protected Long studentId;

        @Column(name = "fk_test_paper")
        protected Long testPaperId;

        public TestWriteByStudentId() {

        }

        public TestWriteByStudentId(Long studentId, Long testPaperId) {
            this.studentId = studentId;
            this.testPaperId = testPaperId;
        }
    }

    @EmbeddedId
    private TestWriteByStudentId id;

    @ManyToOne
    @JoinColumn(name = "fk_student", insertable = false, updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "fk_test_paper", insertable = false, updatable = false)
    private TestPaper testPaper;

    private double testScore;
    private LocalDate testDate;

    public TestWriteByStudent(TestWriteByStudentId id, Student student, TestPaper testPaper, double testScore, LocalDate testDate) {
        // create primary key
        this.id = new TestWriteByStudentId(student.getStudentId(), testPaper.getTestPaperId());

        // initialize attributes
        this.student = student;
        this.testPaper = testPaper;
        this.testScore = testScore;
        this.testDate = testDate;

        // update relationships to assure referential integrity

        student.getTestPapers().add(this);
        testPaper.getStudents().add(this);
    }

    public TestWriteByStudent() {
    }
}
