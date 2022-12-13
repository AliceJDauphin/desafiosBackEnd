package com.example.demo.model;

public class Events {
	private String id;
	private String provider;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	
	
	public Events(String provider, String id) {
		this.id = id;
		this.provider = provider;
	}
}
