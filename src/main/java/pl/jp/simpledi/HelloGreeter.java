package pl.jp.simpledi;

class HelloGreeter {
    private final Printer printer;

    HelloGreeter(Printer printer) {
        this.printer = printer;
    }

    void greet(String name) {
        printer.print("Hello " + name + "!");
    }
}
