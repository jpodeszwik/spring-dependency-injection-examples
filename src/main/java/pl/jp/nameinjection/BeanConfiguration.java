package pl.jp.nameinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.jp.ordered.Printer;

@Configuration
public class BeanConfiguration {

    @Bean("outPrinterName")
    Printer outPrinter() {
        return text -> System.out.println(text);
    }

    @Bean("errPrinterName")
    Printer errPrinter() {
        return text -> System.err.println(text);
    }

    @Bean
    Greeter greeter(Printer outPrinterName) {
        return name -> outPrinterName.print("Hello " + name + "!");
    }
}
