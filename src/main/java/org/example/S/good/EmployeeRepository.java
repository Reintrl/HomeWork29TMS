package org.example.S.good;

class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Сотрудник сохранен в БД: " + employee.getName());
    }
}