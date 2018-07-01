package pl.jp.listinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    Printer outPrinter() {
        return text -> System.out.println(text);
    }

    @Bean
    Printer errPrinter() {
        return text -> System.err.println(text);
    }
}
