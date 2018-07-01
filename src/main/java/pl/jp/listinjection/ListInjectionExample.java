package pl.jp.listinjection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListInjectionExample implements CommandLineRunner {
    private final GroupGreeter groupGreeter;

    ListInjectionExample(GroupGreeter groupGreeter) {
        this.groupGreeter = groupGreeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListInjectionExample.class, args);
    }

    @Override
    public void run(String... args) {
        groupGreeter.greet("World");
    }
}
