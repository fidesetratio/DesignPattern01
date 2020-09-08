package com.creational.abstractfactory;

public class PulseNotificationFactory implements NotificationFactory {

	@Override
	public Notification createNotification() {
		// TODO Auto-generated method stub
		return new PulseNotification();
	}

}
