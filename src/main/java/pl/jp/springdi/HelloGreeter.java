package pl.jp.springdi;

import org.springframework.stereotype.Component;

@Component
class HelloGreeter {
    private final Printer printer;

    HelloGreeter(Printer printer) {
        this.printer = printer;
    }

    void greet(String name) {
        printer.print("Hello " + name + "!");
    }
}
