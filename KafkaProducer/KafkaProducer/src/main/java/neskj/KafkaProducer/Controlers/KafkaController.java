package neskj.KafkaProducer.Controlers;

import neskj.KafkaProducer.KafkaProducer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    @Autowired
    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("kafka/send")
    public String send(@RequestBody String message){

        System.out.println("New comming message --->> "+message);
        kafkaProducer.sendMessage(message);
        return "Success";
    }

}
