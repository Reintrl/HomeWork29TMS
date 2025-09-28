package org.example.L.good;

class Rectangle implements Shape {
    private int width;
    private int height;

    // Конструктор, сеттеры, геттеры...

    @Override
    public int getArea() {
        return width * height;
    }
}