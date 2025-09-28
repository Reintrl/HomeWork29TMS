package org.example.O.good;

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Отправляем email: " + message);
    }
}