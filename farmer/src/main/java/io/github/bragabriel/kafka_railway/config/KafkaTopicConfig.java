package io.github.bragabriel.kafka_railway.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic groceryStoreTopic() {
        return TopicBuilder.name("rota-mercado")
                .partitions(3)
                .replicas(1)
                .build();
    }

}
