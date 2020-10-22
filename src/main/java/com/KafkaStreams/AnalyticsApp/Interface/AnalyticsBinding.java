package com.KafkaStreams.AnalyticsApp.Interface;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface AnalyticsBinding {
	
	String PAGE_VIEWS_OUT="PageViewsOut";
	
	@Output(PAGE_VIEWS_OUT)
	MessageChannel pageViewsOut();
}
