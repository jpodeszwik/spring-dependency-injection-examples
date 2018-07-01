package pl.jp.simpledi;

class SystemOutPrinter implements Printer {
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
