package org.example.I.bad;

import org.w3c.dom.Document;

interface MultiFunctionDevice {
    void print(Document d);
    void scan(Document d);
    void fax(Document d);
}