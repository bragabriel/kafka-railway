package io.github.bragabriel.kafka_railway.consumerMercado;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
class Worker2 {

	@KafkaListener(topics = "farm-route", groupId = "mercadinho-consumer-group")
	public void receiveProducts(String message) {
		log.info("Worker2 received the product: {}", message);
	}
}