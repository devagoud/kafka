package com.kafka.kafkaproducer.kafkaproducer.kafkaservice;

import com.kafka.kafkaproducer.kafkaproducer.Greeting;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author devagoud
 */
@Service
public class kafkaService {

@Autowired
private KafkaTemplate kafkaTemplate;
@Autowired
    KafkaProducer kafkaProducer;
    public void msg(String msg) {
        Greeting greeting=new Greeting();
        greeting.setMsg(msg);
      kafkaProducer.initTransactions();
    //  kafkaProducer.beginTransaction();
        kafkaProducer.send(new ProducerRecord("deva",greeting.getMsg()));
       kafkaTemplate.send("deva",greeting);
       kafkaProducer.commitTransaction();
    }

}
