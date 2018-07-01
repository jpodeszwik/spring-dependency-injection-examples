package pl.jp.nodi;

public class SystemOutPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
