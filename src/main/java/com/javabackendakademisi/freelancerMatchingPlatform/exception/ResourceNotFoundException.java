package com.javabackendakademisi.freelancerMatchingPlatform.exception;


public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {

        super(message);
    }
}
