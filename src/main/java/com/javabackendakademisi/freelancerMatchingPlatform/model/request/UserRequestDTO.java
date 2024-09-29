package com.javabackendakademisi.freelancerMatchingPlatform.model.request;

import javax.validation.constraints.NotNull;

public class UserRequestDTO {
    @NotNull(message = "Name cannot be null")
    private String name;
    @NotNull(message = "Email cannot be null")
    private String email;
    @NotNull(message = "Role cannot be null")
    private String role;

    public @NotNull(message = "Name cannot be null") String getName() {
        return name;
    }

    public void setName(@NotNull(message = "Name cannot be null") String name) {
        this.name = name;
    }

    public @NotNull(message = "Email cannot be null") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "Email cannot be null") String email) {
        this.email = email;
    }

    public @NotNull(message = "Role cannot be null") String getRole() {
        return role;
    }

    public void setRole(@NotNull(message = "Role cannot be null") String role) {
        this.role = role;
    }
}
