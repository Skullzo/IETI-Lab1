package edu.escuelaing.ieti.data;
public class User {
    private final String id;
    private final String name;
    private final String email;
    private final String lastName;
    private final String createdAt;
    public User(String id, String name, String email, String lastName, String createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
    }
}