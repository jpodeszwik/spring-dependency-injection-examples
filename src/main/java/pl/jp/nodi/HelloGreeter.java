package pl.jp.nodi;

class HelloGreeter {
    private final Printer printer = new SystemOutPrinter();

    void greet(String name) {
        printer.print("Hello " + name + "!");
    }
}
