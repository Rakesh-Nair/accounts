package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Accounts Details"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of the Customer"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number should be of 10 digits")
    @NotEmpty(message = "Account number can not be empty or null")
    private Long accountNumber;

    @Schema(
            description = "Account Type of Account"
    )
    @NotEmpty(message = "Account Type can not be empty or null")
    private String accountType;

    @Schema(
            description = "Branch Address of Accounts"
    )
    @NotEmpty(message = "Branch Address can not be empty or null")
    private String branchAddress;
}
