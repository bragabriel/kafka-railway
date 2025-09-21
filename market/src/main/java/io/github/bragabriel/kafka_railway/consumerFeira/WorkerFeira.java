package io.github.bragabriel.kafka_railway.consumerFeira;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
class WorkerFeira {

	@KafkaListener(topics = "farm-route", groupId = "feira-consumer-group")
	public void receiveProducts(String message) {
		log.info("WorkerFeira received the product: {}", message);
	}
}