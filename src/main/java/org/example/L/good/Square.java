package org.example.L.good;

class Square implements Shape {
    private int side;

    // Конструктор, сеттер, геттер...

    @Override
    public int getArea() {
        return side * side;
    }
}