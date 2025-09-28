package org.example.O.bad;

class NotificationService {
    public void sendNotification(String type, String message) {
        if ("email".equals(type)) {
            System.out.println("Отправляем email: " + message);
        } else if ("sms".equals(type)) {
            System.out.println("Отправляем SMS: " + message);
        }
        // Чтобы добавить что-то новое, придется добавить еще один else if
    }
}