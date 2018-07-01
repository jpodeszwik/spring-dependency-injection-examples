package pl.jp.manyinstances;

class PrefixedPrinter implements Printer {
    private final String prefix;

    PrefixedPrinter(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void print(String text) {
        System.out.println(prefix + text);
    }
}
