package pl.jp.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SetterInjection implements CommandLineRunner {
    private HelloGreeter helloGreeter;

    @Autowired
    void setHelloGreeter(HelloGreeter helloGreeter) {
        this.helloGreeter = helloGreeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(SetterInjection.class, args);
    }

    @Override
    public void run(String... args) {
        helloGreeter.greet("World");
    }
}
