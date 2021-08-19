package edu.escuelaing.ieti.dto;
public class UserDto {
    private final String name;
    private final String email;
    private final String lastName;
    private final String createdAt;
    public UserDto(String name, String email, String lastName, String createdAt) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
    }
}