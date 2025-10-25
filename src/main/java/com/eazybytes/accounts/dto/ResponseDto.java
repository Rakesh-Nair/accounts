package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Schema to hold Successful Information"
)
@Data @AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status Code"
    )
    private String statusCode;

    @Schema(
            name = "Status Message"
    )
    private String statusMsg;
}
