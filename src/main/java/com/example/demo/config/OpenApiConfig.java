package com.example.demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springdoc.core.SpringDocUtils;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class OpenApiConfig {
    static {
        SpringDocUtils.getConfig().replaceWithClass(org.springdoc.core.GroupedOpenApi.class, org.springdoc.core.GroupedOpenApi.class);
    }
}