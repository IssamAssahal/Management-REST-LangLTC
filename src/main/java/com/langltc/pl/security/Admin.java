package com.langltc.pl.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;
import java.time.LocalDate;
import java.util.Collection;

/**
 * @author Issam As-sahal ISA
 * @Created 2:14 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "admin", schema = "public")
public class Admin implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adminId;
    @NotNull
    private String name;
    @NotNull
    private String username;
    @NotNull
    @JsonIgnore
    private String password;
    @NotNull
    private LocalDate created;

    public void login() {
    }

    public void logout() {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }


    public void addNewTeachers() {
    }

    public void modifyTeachers() {
    }

    public void addNewStudent() {
    }

    public void modifyStudent() {
    }

    public void addNewCourse() {
    }

    public void modifyCourse() {
    }
}
