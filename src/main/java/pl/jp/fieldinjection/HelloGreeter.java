package pl.jp.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class HelloGreeter {
    @Autowired
    private Printer printer;

    void greet(String name) {
        printer.print("Hello " + name + "!");
    }
}
