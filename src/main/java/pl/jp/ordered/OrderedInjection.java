package pl.jp.ordered;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderedInjection implements CommandLineRunner {
    private final GroupGreeter groupGreeter;

    OrderedInjection(GroupGreeter groupGreeter) {
        this.groupGreeter = groupGreeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderedInjection.class, args);
    }

    @Override
    public void run(String... args) {
        groupGreeter.greet("World");
    }
}
