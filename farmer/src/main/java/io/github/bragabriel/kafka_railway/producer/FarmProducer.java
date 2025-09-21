package io.github.bragabriel.kafka_railway.producer;

import io.github.bragabriel.kafka_railway.model.ProductMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FarmProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public FarmProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(ProductMessage productMessage) {

        ProducerRecord<String, String> record =
                new ProducerRecord<>(productMessage.route(), productMessage.key(), productMessage.content());

        kafkaTemplate.send(record);
    }
}
