package org.example.O.good;

class TelegramNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Отправляем Telegram: " + message);
    }
}