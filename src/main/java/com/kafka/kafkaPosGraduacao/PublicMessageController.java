package com.kafka.kafkaPosGraduacao;

import com.kafka.kafkaPosGraduacao.config.producer.MessageProducer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send-message")
@AllArgsConstructor
public class PublicMessageController {

    private final MessageProducer messageProducer;

    @RequestMapping
    public String sendMessage(@RequestParam("message") String message) {
        messageProducer.sendMessage("topic1", message);
        return "Publish successfuly";
    }
}
