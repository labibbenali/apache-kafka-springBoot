package com.kafka.project.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean("topic1")
    public NewTopic topic1() {
        return TopicBuilder
                .name("topic1")
                .build();
    }
    @Bean("topic2")
    public NewTopic topic2() {
        return TopicBuilder
                .name("topic2")
                .build();
    }

}
