package org.example.D.good;

class PasswordReminder {
    private DBConnectionInterface dbConnection;

    // Внедрение зависимости через конструктор (Dependency Injection)
    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }

    // логика напоминания пароля
}