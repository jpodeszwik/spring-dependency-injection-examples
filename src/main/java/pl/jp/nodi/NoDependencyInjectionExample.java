package pl.jp.nodi;

public class NoDependencyInjectionExample {
    public static void greetTheWorld() {
        HelloGreeter helloGreeter = new HelloGreeter();
        helloGreeter.greet("World");
    }

    public static void main(String[] args) {
        greetTheWorld();
    }
}
