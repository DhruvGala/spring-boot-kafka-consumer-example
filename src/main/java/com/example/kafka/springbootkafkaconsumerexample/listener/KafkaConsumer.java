package com.example.kafka.springbootkafkaconsumerexample.listener;

import com.example.kafka.springbootkafkaconsumerexample.model.AnimeDetailsModel;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message) {
        System.out.println("consumed: " + message);
    }

    @KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
        containerFactory = "animeKafkaListenerFactory")
    public void consumeJson(AnimeDetailsModel animeDetailsModel){
        System.out.println("Consumed Json Msg: " + animeDetailsModel);
    }
}
