package com.creational.abstractfactory;

abstract class AbstractNotificationFactory {
	
	enum TYPE_NOTIFICATION {
	    SMS, PULSE
	}

		private static final SMSNotification SMS_NOTIFICATION = new SMSNotification();
		private static final PulseNotification PULSE_NOTIFICATION = new PulseNotification();
		
		
		public static NotificationFactory getFactory(TYPE_NOTIFICATION typeNotification){
			NotificationFactory notificationFactory = null;
			switch(typeNotification){
			case SMS:
				notificationFactory = new SMSNotificationFactory();
			break;
			case PULSE:
				notificationFactory = new PulseNotificationFactory();
			break;
			}
			return notificationFactory;
		}
		
}
