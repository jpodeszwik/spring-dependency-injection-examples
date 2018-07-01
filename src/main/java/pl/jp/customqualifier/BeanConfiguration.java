package pl.jp.customqualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.jp.ordered.Printer;

@Configuration
public class BeanConfiguration {

    @OutQualifier
    @Bean
    Printer outPrinter() {
        return text -> System.out.println(text);
    }

    @Bean
    Printer errPrinter() {
        return text -> System.err.println(text);
    }

    @Bean
    Greeter greeter(@OutQualifier Printer printer) {
        return name -> printer.print("Hello " + name + "!");
    }
}
