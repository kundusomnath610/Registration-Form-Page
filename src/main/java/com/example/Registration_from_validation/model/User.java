package com.example.Registration_from_validation.model;


import jakarta.validation.constraints.*;

public class User {

    @NotBlank(message = "Type your name")
    private String name;

    @NotBlank(message = "Example@gmail.com")
    @Email(message = "Enter your Email")
    private String email;

    @NotBlank(message = "password required")
    @Size(min = 4, max = 10)
    private String password;

    @NotBlank(message = "age required")
    @Min(18)
    @Max(60)
    private String age;

    @NotBlank(message = "Type your address")
    private String address;

//     User Constructor
    public User () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
