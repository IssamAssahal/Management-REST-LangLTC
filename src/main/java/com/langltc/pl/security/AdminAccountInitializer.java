package com.langltc.pl.security;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author Issam As-sahal ISA
 * @Created 8:03 PM
 **/
@Component
@Log
public class AdminAccountInitializer implements CommandLineRunner {
    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
//        if (userService.findAllAdmin().isEmpty()) {
//            log.info("No admin account found , Create an account");
//            Admin admin = new Admin(1, "Jack Wilt", "issam12", "123456", LocalDate.now());
//            userService.saveAdmin(admin);
//        }


    }
}
