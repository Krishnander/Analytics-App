package com.KafkaStreams.AnalyticsApp.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageView {
	private String UserId;
	private String page;
	private int duration;
	public PageView(String userId, String page, int duration) {
		super();
		this.UserId = userId;
		this.page = page;
		this.duration = duration;
	}
	public String getUserId() {
		return this.UserId;
	}
	public void setUserId(String userId) {
		this.UserId = userId;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	
}
