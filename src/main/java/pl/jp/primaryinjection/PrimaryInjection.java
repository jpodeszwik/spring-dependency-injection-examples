package pl.jp.primaryinjection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaryInjection implements CommandLineRunner {
    private final Greeter greeter;

    PrimaryInjection(Greeter greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(PrimaryInjection.class, args);
    }

    @Override
    public void run(String... args) {
        greeter.greet("World");
    }
}
