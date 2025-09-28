package org.example.I.bad;

import org.w3c.dom.Document;

class SimplePrinter implements MultiFunctionDevice {
    @Override
    public void print(Document d) {
        // OK, это его основная функция
    }

    @Override
    public void scan(Document d) {
        throw new UnsupportedOperationException("Сканирование не поддерживается!");
    }

    @Override
    public void fax(Document d) {
        throw new UnsupportedOperationException("Факс не поддерживается!");
    }
}