package com.kafka.project.consumer;

import com.kafka.project.payload.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "topic1", groupId = "myGroup")
    public void consumeMessage(String message){
        log.info("Consumming the message from topic1 : at : {}, message :: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), message);

    }


    @KafkaListener(topics = "topic2", groupId = "myGroup")
    public void consumeJsonMessage(Student student){
        log.info("Consumming the message from topic2 as json : at : {}, message :: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), student.toString());

    }
}
