package com.KafkaStreams.AnalyticsApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.KafkaStreams.AnalyticsApp.Interface.AnalyticsBinding;

@SpringBootApplication
@EnableBinding(AnalyticsBinding.class)
public class AnalyticsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalyticsAppApplication.class, args);
	}
	
	

}
