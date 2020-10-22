package com.KafkaStreams.AnalyticsApp.Impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import com.KafkaStreams.AnalyticsApp.Interface.AnalyticsBinding;
import com.KafkaStreams.AnalyticsApp.POJO.PageView;

@Component
public class PageViewEventSource implements ApplicationRunner {

	private final MessageChannel pageViewsOut;
	
	
	
	public PageViewEventSource(AnalyticsBinding binding) {
		this.pageViewsOut=binding.pageViewsOut();
	}



	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<String> names=Arrays.asList("Gopal","Krishna","Gopi","Warrior","Resilient","Winner");
		List<String> pages=Arrays.asList("Blog","Site","SDK","IOS","Web","Store");
		
		Runnable runnable=()->{
			String randomPage=pages.get(new Random().nextInt(pages.size()));
			String randomName=names.get(new Random().nextInt(names.size()));
			
			PageView pageView=new PageView(randomName,randomPage, Math.random()>1?10:1000);
			
		};
	}

}
