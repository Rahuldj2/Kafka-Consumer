package com.twg.twg_consumer.services;


import com.twg.twg_consumer.models.TransactionMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics={"transaction-topic"},groupId="group-id")
    public void consume(TransactionMessage transactionMessage){
        log.info("we received transaction with id" + transactionMessage.getTransactionId()
        +"the status is" + transactionMessage.getStatus());
    }
}
