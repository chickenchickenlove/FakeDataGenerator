package org.hello.chickenchickenlove.fakeDataGenerator.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.hello.chickenchickenlove.fakeDataGenerator.store.ConfigStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Component
@Slf4j
public class DataProducer {

    private final ConfigStore configStore;
    private KafkaProducer<String, String> producer;

    @Value("${producer.bootstrapServer}")
    private String bootstrapServer;

    public DataProducer(ConfigStore configStore) {
        this.configStore = configStore;

        Properties props = new Properties();
        props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
        props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        this.producer = new KafkaProducer<String, String>(props);
    }


    public void executeProducer() {
        // 종료 로직
        Runtime.getRuntime().addShutdownHook(new Thread(() -> producer.close()));
        Thread thread = new Thread(this::runrun);
        thread.start();
    }

    private void runrun() {

        while (true) {

            HashMap<String, HashMap<String, String>> copyConfig = configStore.createCopyConfig();

            for (Map.Entry<String, HashMap<String, String>> topicStore : copyConfig.entrySet()) {

                HashMap<String, String> topicName = topicStore.getValue();
                HashMap<String, String> fields = topicStore.getValue();

                List<HashMap<String, Object>> createdMap = createFakerDataWithTopic();
                createMessageList()





            }





        }


    }

    private List<HashMap<String, Object>> createFakerDataWithTopic() {
        continue;


    }

}
