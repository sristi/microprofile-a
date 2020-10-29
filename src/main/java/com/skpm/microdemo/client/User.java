package com.skpm.microdemo.client;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

public class User {
    @Max(100000)
    private Long id;
    @NotBlank(message = "name can should not be blank")
    private String name;
    @NotBlank
    @JsonProperty("user_name")
    private String userName;
    @NotBlank
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {}//added to fix Json Deserialization error No default constructor found
}

