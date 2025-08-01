package io.github.bragabriel.kafka_railway.model;

/**
 * A record representing a product message in the Kafka messaging system.
 * <p>This model is used to encapsulate the message that is sent through Kafka.
 * The message is associated with a route (or topic) that defines where the
 * message will be sent, and the content represents the actual data being
 * transmitted.
 *
 * @param route The topic in Kafka (the track) where the message will be sent.
 * @param content The message content (the cargo) that is being sent.
 */
public record ProductMessage(String route, String content) {

}
