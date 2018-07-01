package pl.jp.qualifiedlist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QualifiedListInjection implements CommandLineRunner {
    private final Greeter greeter;

    QualifiedListInjection(Greeter greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(QualifiedListInjection.class, args);
    }

    @Override
    public void run(String... args) {
        greeter.greet("World");
    }
}
