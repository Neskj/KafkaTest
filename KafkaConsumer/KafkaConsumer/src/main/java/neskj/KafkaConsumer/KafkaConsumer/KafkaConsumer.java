package neskj.KafkaConsumer.KafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class KafkaConsumer {

    private final static Logger logger = Logger.getLogger(KafkaConsumer.class.getName());

    @KafkaListener(topics = "course", groupId = "my_consumer")
    public void listen(String message) {

        logger.info("\nRecive new message from Producer : " + message);
    }
}
