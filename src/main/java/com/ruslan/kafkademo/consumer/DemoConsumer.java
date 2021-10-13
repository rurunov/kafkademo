package com.ruslan.kafkademo.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruslan.kafkademo.model.Event;
import com.ruslan.kafkademo.service.EventService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer {

    private final EventService eventService;

    @Autowired
    public DemoConsumer(EventService eventService) {
        this.eventService = eventService;
    }

    @KafkaListener(topics = "spring-kafka-demo", concurrency = "10")
    public void listenTopic(ConsumerRecord<String, String> record) {
        ObjectMapper objectMapper = new ObjectMapper();
        Event event = null;
        try {
            event = objectMapper.readValue(record.value(), Event.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        eventService.setEvent(event);
    }

}
