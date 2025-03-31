package io.github.bragabriel.kafka_railway.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
            title = "Farm API",
                description = """
                    📺 <strong>Youtube Playlist:</strong>
                    <a href='https://springdoc.org/#properties' target="_blank">youtube.com/@gabrielbragadev</a><br><br>
                    🐙 <strong>GitHub:</strong>
                    <a href='https://github.com/bragabriel/kafka-railway' target="_blank">github.com/bragabriel/kafka-railway</a><br><br>
                    💼 <strong>LinkedIn:</strong>
                    <a href='https://www.linkedin.com/in/gabriel-braga-da-silva' target="_blank">linkedin.com/gabriel-braga-da-silva</a><br><br>
                    """,
            version = "v1.0",
            contact = @Contact(
                    name = "Gabriel Braga"
            )
        )
)
public class SwaggerConfig {
}
