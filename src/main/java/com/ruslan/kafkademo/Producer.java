package com.ruslan.kafkademo;

public class Producer {

    public Producer(String topic) {
        this.topic = topic;
    }

    private String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
