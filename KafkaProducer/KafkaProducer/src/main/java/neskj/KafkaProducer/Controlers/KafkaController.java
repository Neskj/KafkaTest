package neskj.KafkaProducer.Controlers;

import neskj.KafkaProducer.KafkaProducer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class KafkaController {

    private final KafkaProducer kafkaProducer;
    private final static Logger logger = Logger.getLogger(KafkaController.class.getName());

    @Autowired
    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("kafka/send")
    public String send(@RequestBody String message) {

        logger.info("\nNew incomming message from HTTP --->> " + message);
        kafkaProducer.sendMessage(message);

        return "Success";
    }
}
