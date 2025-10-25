package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Setter;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold the Customer and Accounts details"
)
public class CustomerDto {

    @NotEmpty(message = "Name can not be empty or null")
    @Size(min = 5, max = 30, message = "Name should be between 5 and 30 characters")
    @Schema(
            description = "Name of the Customer",
            example = "Rakesh Nair"
    )
    private String name;

    @NotEmpty(message = "Email can not be empty or null")
    @Schema(
            description = "Email Value",
            example = "abc@def.com"
    )
    @Email(message = "Email address should be valid value")
    private String email;

    @Schema(
            description = "Mobile number of the Customer",
            example = "9876543210"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be of 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
