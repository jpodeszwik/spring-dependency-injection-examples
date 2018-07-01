package pl.jp.anonymousclasslambdabeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.jp.ordered.Printer;

@Configuration
public class BeanConfiguration {

    @Bean
    Printer printer() {
        return text -> System.out.println(text);
    }

    @Bean
    Greeter greeter(Printer printer) {
        return new Greeter() {
            @Override
            public void greet(String name) {
                printer.print("Hello " + name + "!");
            }
        };
    }
}
