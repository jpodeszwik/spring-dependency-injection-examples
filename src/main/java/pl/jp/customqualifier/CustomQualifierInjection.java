package pl.jp.customqualifier;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomQualifierInjection implements CommandLineRunner {
    private final Greeter greeter;

    CustomQualifierInjection(Greeter greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomQualifierInjection.class, args);
    }

    @Override
    public void run(String... args) {
        greeter.greet("World");
    }
}
