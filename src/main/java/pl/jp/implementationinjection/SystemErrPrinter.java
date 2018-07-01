package pl.jp.implementationinjection;

import org.springframework.stereotype.Component;

@Component
class SystemErrPrinter implements Printer {
    @Override
    public void print(String text) {
        System.err.println(text);
    }
}
