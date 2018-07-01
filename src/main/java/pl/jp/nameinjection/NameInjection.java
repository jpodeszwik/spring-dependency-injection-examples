package pl.jp.nameinjection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NameInjection implements CommandLineRunner {
    private final Greeter greeter;

    NameInjection(Greeter greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(NameInjection.class, args);
    }

    @Override
    public void run(String... args) {
        greeter.greet("World");
    }
}
