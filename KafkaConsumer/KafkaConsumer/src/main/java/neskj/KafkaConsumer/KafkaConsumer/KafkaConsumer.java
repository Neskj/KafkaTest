package neskj.KafkaConsumer.KafkaConsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "course",groupId = "my_consumer")
    public void listen(String message){

        System.out.println("Recive new message : "+message);



    }
}
