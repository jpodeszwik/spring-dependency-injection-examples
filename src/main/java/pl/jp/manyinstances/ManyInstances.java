package pl.jp.manyinstances;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyInstances implements CommandLineRunner {
    private final HelloGreeter helloGreeter;

    ManyInstances(HelloGreeter helloGreeter) {
        this.helloGreeter = helloGreeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(ManyInstances.class, args);
    }

    @Override
    public void run(String... args) {
        helloGreeter.greet("World14");
    }
}
