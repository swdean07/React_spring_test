package com.busanit501.api5012.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {

        // Security 설정 추가
        SecurityScheme securityScheme = new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT")
                .name("Authorization");

        return new OpenAPI()
                .info(new Info()
                        .title("레스트 API 테스트")
                        .description("Rest 활용해서 댓글도 구현해보기")
                        .version("1.0.0")
                )
        //추가
        .addSecurityItem(new SecurityRequirement().addList("Authorization"))
        .schemaRequirement("Authorization", securityScheme);
    }

}
