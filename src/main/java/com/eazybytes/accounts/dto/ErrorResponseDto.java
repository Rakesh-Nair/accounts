package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold Error Information"
)
@Data @AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "API Path",
            example = "/accounts"
    )
    private String apiPath;

    @Schema(
            name = "Error Code",
            example = "404"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error Message",
            example = "Resource not found"
    )
    private String errorMessage;

    @Schema(
            description = "Time of Request"
    )
    private LocalDateTime errorTime;
}
