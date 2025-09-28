package org.example.L.bad;

class Square extends Rectangle {
    // Нарушение LSP: изменение ширины квадрата меняет и высоту, что неожиданно для кода, работающего с Rectangle
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Неожиданный побочный эффект!
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // Неожиданный побочный эффект!
    }
}