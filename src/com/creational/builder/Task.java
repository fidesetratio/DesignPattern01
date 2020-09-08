package com.creational.builder;

public class Task {



	private String id;
	private String name;
	private String action;
	public Task(String id, String name, String action) {
		super();
		this.id = id;
		this.name = name;
		this.action = action;
	}
	
	public static class Builder{
		
			private String id;
			private String name;
			private String action;
			
			public Builder(String id){
				this.id = id;
				
			}
			
			public Builder setName(String name){
				this.name = name;
				return this;
			}
			
			public Builder setAction(String action){
				this.action = action;
				return this;
			}
			
			public Task build(){
				return new Task(this.id,this.name,this.action);
			}
	}
	
	public Task(){
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}
