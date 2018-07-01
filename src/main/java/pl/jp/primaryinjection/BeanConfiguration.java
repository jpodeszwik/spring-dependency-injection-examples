package pl.jp.primaryinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pl.jp.ordered.Printer;

@Configuration
public class BeanConfiguration {

    @Primary
    @Bean
    Printer outPrinter() {
        return text -> System.out.println(text);
    }

    @Bean
    Printer errPrinter() {
        return text -> System.err.println(text);
    }

    @Bean
    Greeter greeter(Printer printer) {
        return name -> printer.print("Hello " + name + "!");
    }
}
