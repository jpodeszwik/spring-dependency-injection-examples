package pl.jp.qualifiedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("beanConfiguration4")
public class BeanConfiguration {
    private static final Logger log = LoggerFactory.getLogger(BeanConfiguration.class);

    @Qualifier("info")
    @Bean
    Printer ourPrinter() {
        return name -> System.out.println(name);
    }

    @Qualifier("error")
    @Bean
    Printer errPrinter() {
        return name -> System.err.println(name);
    }

    @Qualifier("info")
    @Bean
    Printer logPrinter() {
        return name -> log.info(name);
    }
}
