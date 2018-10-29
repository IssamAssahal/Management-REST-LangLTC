package com.langltc.pl.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Issam As-sahal ISA
 * @Created 7:37 PM
 **/
@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
}
