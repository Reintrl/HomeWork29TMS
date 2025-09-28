package org.example.O.good;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification(new EmailNotification(), "Ваш заказ готов!");
        service.sendNotification(new SmsNotification(), "Ваш заказ готов!");
        service.sendNotification(new TelegramNotification(), "Ваш заказ готов!");
    }
}
