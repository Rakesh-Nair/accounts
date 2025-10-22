package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number should be of 10 digits")
    @NotEmpty(message = "Account number can not be empty or null")
    private Long accountNumber;

    @NotEmpty(message = "Account Type can not be empty or null")
    private String accountType;

    @NotEmpty(message = "Branch Address can not be empty or null")
    private String branchAddress;
}
