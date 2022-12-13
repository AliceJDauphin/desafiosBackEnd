package com.example.demo.model;

public class Launches {
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
	
	
	
	public Launches(String provider, String id) {
		this.id = id;
		this.provider = provider;
	}
}
