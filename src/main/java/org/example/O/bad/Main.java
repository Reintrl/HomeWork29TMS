package org.example.O.bad;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("email", "Ваш заказ готов!");
        service.sendNotification("sms", "Ваш заказ готов!");
    }
}
