package com.creational.abstractfactory;

public class SMSNotificationFactory implements NotificationFactory {

	
	
	
	@Override
	public Notification createNotification() {
		// TODO Auto-generated method stub
		return new SMSNotification();
	}

}
