package com.langltc.pl.security;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Issam As-sahal ISA
 * @Created 4:11 PM
 **/
@Service
@Log
public class UserService implements UserDetailsService {
    @Autowired
    private AdminRepository adminRepository;

    @Bean
    private PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return  null;
   }

    public Admin saveAdmin(Admin admin) {
        admin.setPassword(passwordEncoder().encode(admin.getPassword()));
       return adminRepository.save(admin);
    }



  public List<Admin> findAllAdmin(){

        return  adminRepository.findAll();
    }


}
