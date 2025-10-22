package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Setter;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name can not be empty or null")
    @Size(min = 5, max = 30, message = "Name should be between 5 and 30 characters")
    private String name;

    @NotEmpty(message = "Email can not be empty or null")
    @Email(message = "Email address should be valid value")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be of 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
