package pl.jp.implementationinjection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImplementationInjection implements CommandLineRunner {
    private final HelloGreeter helloGreeter;

    ImplementationInjection(HelloGreeter helloGreeter) {
        this.helloGreeter = helloGreeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(ImplementationInjection.class, args);
    }

    @Override
    public void run(String... args) {
        helloGreeter.greet("World");
    }
}
