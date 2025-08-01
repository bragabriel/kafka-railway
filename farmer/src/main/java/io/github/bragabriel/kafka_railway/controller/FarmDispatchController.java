package io.github.bragabriel.kafka_railway.controller;

import io.github.bragabriel.kafka_railway.model.ProductMessage;
import io.github.bragabriel.kafka_railway.producer.FarmProducer;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/farm")
@RequiredArgsConstructor
public class FarmDispatchController {

    private final FarmProducer farmProducer;

    @Tag(name = "Farm", description = "API to send farm products to the city")
    @PostMapping()
    public ResponseEntity<String> farm(@RequestBody ProductMessage productMessage) {
        farmProducer.produce(productMessage);
        return ResponseEntity
                .accepted()
                .body(String.format(
                        "Farmer sent the product '%s' to the route '%s'",
                        productMessage.content(), productMessage.route()
                ));
    }
}
