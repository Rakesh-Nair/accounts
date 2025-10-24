package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts Microservice REST API Documentation",
                version = "1.0",
                description = "Accounts Service documentation",
                contact = @Contact(
                        name = "Rakesh Nair",
                        email = "rakesh.nairs@eazybytes.com",
                        url = "https://eazybytes.com"
                ),
                license = @License(
                        name = "Eazybytes License",
                        url = "https://eazybytes.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Accounts Service Documentation",
                url = "https://eazybytes.com"
        )
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
