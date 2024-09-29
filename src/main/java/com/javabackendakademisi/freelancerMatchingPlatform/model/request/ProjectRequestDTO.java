package com.javabackendakademisi.freelancerMatchingPlatform.model.request;

import javax.validation.constraints.NotNull;

public class ProjectRequestDTO {
    @NotNull(message = "Title cannot be null")
    private String title;
    @NotNull(message = "Description cannot be null")
    private String description;
    @NotNull(message = "Budget cannot be null")
    private double budget;

    public @NotNull(message = "Description cannot be null") String getDescription() {
        return description;
    }

    public void setDescription(@NotNull(message = "Description cannot be null") String description) {
        this.description = description;
    }

    @NotNull(message = "Budget cannot be null")
    public double getBudget() {
        return budget;
    }

    public void setBudget(@NotNull(message = "Budget cannot be null") double budget) {
        this.budget = budget;
    }

    public @NotNull(message = "Title cannot be null") String getTitle() {
        return title;
    }

    public void setTitle(@NotNull(message = "Title cannot be null") String title) {
        this.title = title;
    }
}
