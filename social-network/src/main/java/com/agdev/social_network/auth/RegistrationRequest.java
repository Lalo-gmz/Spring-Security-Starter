package com.agdev.social_network.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "First name is mandatory")
    @NotBlank(message = "First name is mandatory")
    private String firstname;
    @NotEmpty(message = "last name is mandatory")
    @NotBlank(message = "Last name is mandatory")
    private String lastname;
    @Email(message = "Email is not formated")
    @NotEmpty(message = "Email name is mandatory")
    @NotBlank(message = "Email name is mandatory")
    private String email;

    @NotEmpty(message = "Email name is mandatory")
    @NotBlank(message = "Email name is mandatory")
    @Size(min = 8, message = "Password should be 8 characters long minimum")
    private String password;
}
