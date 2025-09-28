package org.example.O.good;

class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Отправляем SMS: " + message);
    }
}