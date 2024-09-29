package com.javabackendakademisi.freelancerMatchingPlatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

@Entity
@Table(name="Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Title cannot be null")
    private String title;
    @NotNull(message = "Description cannot be null")
    private String description;
    @NotNull(message = "Budget cannot be null")
    private double budget;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public  @NotNull(message = "Title cannot be null") String getTitle() {
        return title;
    }

    public void setTitle( @NotNull(message = "Title cannot be null") String title) {
        this.title = title;
    }


    public  @NotNull(message = "Description cannot be null") String getDescription() {
        return description;
    }

    public void setDescription( @NotNull(message = "Description cannot be null") String description) {
        this.description = description;
    }
    public  @NotNull(message = "Budget cannot be null") double getBudget() {
        return budget;
    }

    public void setBudget( @NotNull(message = "Budget cannot be null") double budget) {
        this.budget = budget;
    }

}
