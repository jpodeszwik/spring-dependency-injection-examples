package pl.jp.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.jp.ordered.Printer;

@Configuration
public class BeanConfiguration {

    @Qualifier("outPrinter")
    @Bean
    Printer outPrinter() {
        return text -> System.out.println(text);
    }

    @Bean
    Printer errPrinter() {
        return text -> System.err.println(text);
    }

    @Bean
    Greeter greeter(@Qualifier("outPrinter") Printer printer) {
        return name -> printer.print("Hello " + name + "!");
    }
}
