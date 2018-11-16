package com.kafka.kafkaproducer.kafkaproducer;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * @author devagoud
 */
@Getter
@Setter
public class Greeting {
    String id= UUID.randomUUID().toString();
    String msg;
}
