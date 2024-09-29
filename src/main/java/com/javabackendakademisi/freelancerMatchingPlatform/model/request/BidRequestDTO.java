package com.javabackendakademisi.freelancerMatchingPlatform.model.request;

import javax.validation.constraints.NotNull;

public class BidRequestDTO {
    @NotNull(message = "Amount cannot be null")
    public double getAmount() {
        return amount;
    }

    public void setAmount(@NotNull(message = "Amount cannot be null") double amount) {
        this.amount = amount;
    }

    @NotNull(message = "Amount cannot be null")
    private double amount;
}
