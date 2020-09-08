package com.creational.factorymethod;

public class FactoryMethod {
	
	
	
	
	public static void main(String args[]){
		System.out.println("Factory Method");
		NotificationFactory.createNotificationFactory("SMS").notifyUser();
		NotificationFactory.createNotificationFactory("Email").notifyUser();
		
	}
	

	
	

}
