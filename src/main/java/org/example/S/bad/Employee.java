package org.example.S.bad;

class Employee {
    private String name;
    private String position;

    public String getName() {
        return name;
    }

    public void saveEmployeeToDatabase(Employee employee) {
        System.out.println("Сотрудник сохранен в БД: " + employee.getName());
    }

    public void generatePayrollReport(Employee employee) {
        System.out.println("Отчет по зарплате для: " + employee.getName());
    }
}