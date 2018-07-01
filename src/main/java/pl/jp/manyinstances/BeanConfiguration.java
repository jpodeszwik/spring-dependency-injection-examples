package pl.jp.manyinstances;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("beanConfiguration3")
public class BeanConfiguration {

    @Bean
    Printer prefixedWithPrefix() {
        return new PrefixedPrinter("prefix.");
    }

    @Bean
    Printer prefixedWithDot() {
        return new PrefixedPrinter(".");
    }

    @Bean
    HelloGreeter greeter(Printer prefixedWithPrefix) {
        return new HelloGreeter(prefixedWithPrefix);
    }
}
