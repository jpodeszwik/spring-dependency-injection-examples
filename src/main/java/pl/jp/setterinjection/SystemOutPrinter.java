package pl.jp.setterinjection;

import org.springframework.stereotype.Component;

@Component
class SystemOutPrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
