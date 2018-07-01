package pl.jp.ordered;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class BeanConfiguration {

    @Order(1)
    @Bean
    Printer errPrinter() {
        return text -> System.err.println(text);
    }
}
