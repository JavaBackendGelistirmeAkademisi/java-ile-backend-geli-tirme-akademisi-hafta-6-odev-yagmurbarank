package com.javabackendakademisi.freelancerMatchingPlatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

@Entity
@Table(name="Bid")
public class Bid {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long projectId;
    private Long userId;
    @NotNull(message = "Amount cannot be null")
    private double amount;

    //Getter and Setters
    public void setId(Long id) {
        Id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public @NotNull(message = "Amount cannot be null") double getAmount() {
        return amount;
    }

    public void setAmount(@NotNull(message = "Amount cannot be null") double amount) {
        this.amount = amount;
    }


}
