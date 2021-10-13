package com.ruslan.kafkademo.service;

import com.ruslan.kafkademo.model.Event;

public interface EventService {

    Event getResponse();

    void setEvent(Event event);

}
