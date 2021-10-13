package com.ruslan.kafkademo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruslan.kafkademo.dto.EventDto;
import com.ruslan.kafkademo.model.Event;
import com.ruslan.kafkademo.service.impl.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/events")
public class EventController {

    @Value("${config.kafka.topic}")
    private String topic;

    private final KafkaTemplate template;
    private final EventServiceImpl eventService;


    @Autowired
    public EventController(KafkaTemplate template, EventServiceImpl eventService) {
        this.template = template;
        this.eventService = eventService;
    }

    @PostMapping("/receive_event")
    public ResponseEntity<?> receiveEvent(@RequestBody EventDto event) {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        try {
            json = objectMapper.writeValueAsString(Event.builder()
                    .id(event.getId())
                    .name(event.getName())
                    .createdTime(event.getCreatedTime())
                    .build());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        template.send(topic, json);

        return ResponseEntity
                .ok()
                .build();
    }

    @GetMapping("/result")
    public Event getEvent() {
        return eventService.getResponse();
    }

}
