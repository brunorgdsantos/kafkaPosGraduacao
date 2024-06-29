package com.kafka.kafkaPosGraduacao.config.producer;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MessageProducer {

    private final KafkaTemplate<String, String> template;

    public void sendMessage(String topic, String message) {
        template.send(topic, message);
    }
}
