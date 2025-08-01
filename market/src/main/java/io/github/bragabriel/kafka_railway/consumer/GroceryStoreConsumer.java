package io.github.bragabriel.kafka_railway.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
class GroceryStoreConsumer {

	@KafkaListener(topics = "route-market", groupId = "market-consumer-group")
	public void receiveProducts(String message) {
		log.info("GroceryStoreConsumer received the product: {}", message);
	}
}