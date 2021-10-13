package com.ruslan.kafkademo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
@EnableAdminServer
public class KafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoApplication.class, args);

		/*Properties props = new Properties();
		props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.setProperty(ProducerConfig.CLIENT_ID_CONFIG, "clientId");
		props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		Producer producer = new KafkaProducer<String, String>(props);

		String topic = "spring-kafka-demo";

		try {
			producer
					.send(new ProducerRecord(topic, "this", "Hello from JVM"))
					.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			producer.close();
		}*/
	}


}
