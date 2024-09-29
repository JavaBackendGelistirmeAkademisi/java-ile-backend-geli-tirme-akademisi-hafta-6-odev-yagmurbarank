package com.javabackendakademisi.freelancerMatchingPlatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

@Entity
@Table(name= "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NotNull(message = "Name cannot be null")
    private String name;
    @NotNull(message = "Email cannot be null")
    private String email;
    @NotNull(message = "Role cannot be null")
    private String role;

    public User() {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "Name cannot be null") String getName() {
        return name;
    }

    public void setName( @NotNull(message = "Name cannot be null") String name) {
        this.name = name;
    }

    public @NotNull(message = "Email cannot be null") String  getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "Email cannot be null") String email) {
        this.email = email;
    }

    public  @NotNull(message = "Role cannot be null") String getRole() {
        return role;
    }

    public void setRole( @NotNull(message = "Role cannot be null") String role) {
        this.role = role;
    }
}
