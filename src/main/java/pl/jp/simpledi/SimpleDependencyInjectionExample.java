package pl.jp.simpledi;


public class SimpleDependencyInjectionExample {
    public static void greetTheWorld() {
        Printer printer = new SystemOutPrinter();
        HelloGreeter helloGreeter = new HelloGreeter(printer);
        helloGreeter.greet("World2");
    }

    public static void main(String[] args) {
        greetTheWorld();
    }
}
