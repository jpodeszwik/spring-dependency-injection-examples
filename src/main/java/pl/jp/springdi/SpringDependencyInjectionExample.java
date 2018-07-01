package pl.jp.springdi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class SpringDependencyInjectionExample implements CommandLineRunner {
    private final HelloGreeter helloGreeter;

    SpringDependencyInjectionExample(HelloGreeter helloGreeter) {
        this.helloGreeter = helloGreeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDependencyInjectionExample.class, args);
    }

    @Override
    public void run(String... args) {
        helloGreeter.greet("World");
    }
}
