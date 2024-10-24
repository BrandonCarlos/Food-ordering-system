package com.food.ordering.system.kafka.config.data;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "kafka-consumer-config")
public class KafkaConsumerConfigData {
    private String keyDeserializer;
    private String valueDeserializer;
    private String autoOffsetReset;
    private String specificAvroReaderKey;
    private String specificAvroReader;
    private boolean batchListener;
    private boolean autoStartup;
    private Integer concurrencyLevel;
    private Integer sessionTimeoutMs;
    private Integer heartBeatIntervalMs;
    private Integer maxPollIntervalsMs;
    private Long pollTimeoutMs;
    private Integer maxPollRecords;
    private Integer maxPartitionFetchBytesDefault;
    private Integer maxPartitionsFetchBytesBoostFactor;
}
