package pl.jp.anonymousclasslambdabeans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnonymousClassAndLambda implements CommandLineRunner {
    private final Greeter greeter;

    AnonymousClassAndLambda(Greeter greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(AnonymousClassAndLambda.class, args);
    }

    @Override
    public void run(String... args) {
        greeter.greet("World");
    }
}
