package com.test.details.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ApplicationUser {
    private long id = 1;
    @Getter @Setter
    private String userName = "user";
    @Getter @Setter
    private String password = "password";
}
