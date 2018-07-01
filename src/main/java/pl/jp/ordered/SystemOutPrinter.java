package pl.jp.ordered;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
class SystemOutPrinter implements Printer, Ordered {

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
