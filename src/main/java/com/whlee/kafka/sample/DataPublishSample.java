package com.whlee.kafka.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class DataPublishSample {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/send/{topic}/{msg}")
    public String publish(@PathVariable("topic") final  String topic, @PathVariable("msg") final  String msg) {
        /**
         * sending message with topic
         */
        kafkaTemplate.send(topic, msg);

        return "Published successfully";

    }


}
