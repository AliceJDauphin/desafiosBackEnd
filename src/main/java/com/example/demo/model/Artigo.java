package com.example.demo.model;

import java.util.Objects;

public class Artigo {
	
	private int id;
	private boolean featured;
	private String url;
//	private String imageUrl;
//	private String newsSite;
//	private String summary;
//	private String publishedAt;
//	private Launches launches;
//	private Events events;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isFeatured() {
		return featured;
	}
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


	public Artigo(int id, boolean featura, String url) {
		this.id = id;
		this.featured = featura;
		this.url = url;
	}
	
//	public Artigo(Long id, boolean featured, String url, String imageUrl, String newsSite, String summary,
//			String publishedAt, Launches launches, Events events) {
//		super();
//		this.id = id;
//		this.featured = featured;
//		this.url = url;
//		this.imageUrl = imageUrl;
//		this.newsSite = newsSite;
//		this.summary = summary;
//		this.publishedAt = publishedAt;
//		this.launches = launches;
//		this.events = events;
//	}

	
	
	
	
}
