package pl.jp.qualifier;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QualifierInjection implements CommandLineRunner {
    private final Greeter greeter;

    QualifierInjection(Greeter greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(QualifierInjection.class, args);
    }

    @Override
    public void run(String... args) {
        greeter.greet("World");
    }
}
