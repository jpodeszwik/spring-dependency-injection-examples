package pl.jp.qualifiedlist;

import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class GroupGreeter implements Greeter {
    private final List<Printer> printers;

    GroupGreeter(@Qualifier("info") List<Printer> printers) {
        this.printers = printers;
    }

    @Override
    public void greet(String name) {
        printers.forEach(printer -> printer.print("Hello " + name + "!"));
    }
}
