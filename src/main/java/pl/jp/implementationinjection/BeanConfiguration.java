package pl.jp.implementationinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    HelloGreeter greeter(SystemOutPrinter printer) {
        return new HelloGreeter(printer);
    }
}
