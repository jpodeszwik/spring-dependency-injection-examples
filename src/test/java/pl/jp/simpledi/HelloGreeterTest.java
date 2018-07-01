package pl.jp.simpledi;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class HelloGreeterTest {

    @Test
    void greet_shouldPrintHelloWithName() {
        // given
        Printer printer = mock(Printer.class);
        HelloGreeter helloGreeter = new HelloGreeter(printer);
        String name = "World";

        // when
        helloGreeter.greet(name);

        // then
        verify(printer).print(argThat(arg -> arg.contains("Hello") && arg.contains(name)));
    }
}