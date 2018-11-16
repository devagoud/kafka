package com.kafka.kafkaproducer.kafkaproducer.kafkaconsumer;

import com.kafka.kafkaproducer.kafkaproducer.kafkaservice.kafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devagoud
 */
@RestController
public class Kafkacontroller {
@Autowired
    kafkaService kafkaService;

@GetMapping("msg")
    public void msg(@RequestParam String msg){
    kafkaService.msg(msg);

}
}
