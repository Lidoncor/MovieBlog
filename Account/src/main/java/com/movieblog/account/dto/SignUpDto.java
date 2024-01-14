package com.movieblog.account.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SignUpDto {

    @Size(min = 5, message = "The username cannot be shortest than 5 characters!")
    @Size(max = 32, message = "The username cannot be longer than 32 characters!")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "The username can contain only letters!")
    private String username;

    @NotBlank(message = "The password cannot be empty!")
    private String password;

    @Email
    @NotBlank(message = "The email cannot be empty!")
    private String email;
}
