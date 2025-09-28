package org.example.O.good;

class NotificationService {
    public void sendNotification(Notification notification, String message) {
        notification.send(message);
    }
}