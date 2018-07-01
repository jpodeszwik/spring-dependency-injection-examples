package pl.jp.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class HelloGreeter {
    private Printer printer;

    @Autowired
    void setPrinter(Printer printer) {
        this.printer = printer;
    }

    void greet(String name) {
        printer.print("Hello " + name + "!");
    }
}
