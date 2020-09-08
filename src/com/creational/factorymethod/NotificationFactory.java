package com.creational.factorymethod;

public class NotificationFactory {

		public static Notification createNotificationFactory(String channel){
			if(channel == null){
				return null;
			}
			
			if("SMS".equals(channel)){
				return new SMSNotification();
			}
			if("Email".equals(channel)){
				return new EmailNotification();
			}
			if("Pulse".equals(channel)){
				return new PulseNotification();
			}
			
			return null;
			
		}
}
