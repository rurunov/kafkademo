package com.ruslan.kafkademo.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Event {

    private Long id;
    private String name;
    private Long createdTime;

}
