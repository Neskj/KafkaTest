package neskj.KafkaProducer.KafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class KafkaProducer {

    private final static Logger logger = Logger.getLogger(KafkaProducer.class.getName());
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate<String,String> kafkaTemplate){

        this.kafkaTemplate=kafkaTemplate;
    }

    public void sendMessage(String message){

        kafkaTemplate.send("course", message);
        logger.info("\nKafkaProducer send new message");
    }
}
