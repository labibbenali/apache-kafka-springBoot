package com.kafka.wikimedia.consumer.consumer;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Service
@Slf4j
@RequiredArgsConstructor
public class WikiMediaConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "wikiGroup")
    public void consumeMessage(String message){
        log.info("Consuming the message from wikimedia-stream : at : {}, message :: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), message);

    }
}
