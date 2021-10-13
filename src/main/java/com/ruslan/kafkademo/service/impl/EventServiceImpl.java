package com.ruslan.kafkademo.service.impl;

import com.ruslan.kafkademo.model.Event;
import com.ruslan.kafkademo.service.EventService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class EventServiceImpl implements EventService {

    private Event event;

    @Override
    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public Event getResponse() {
        return event;
    }
}
