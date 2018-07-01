package pl.jp.listinjection;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
class GroupGreeter {
    private final List<Printer> printers;

    GroupGreeter(List<Printer> printers) {
        this.printers = printers;
    }

    void greet(String name) {
        printers.forEach(printer -> printer.print("Hello " + name + "!"));
    }
}
