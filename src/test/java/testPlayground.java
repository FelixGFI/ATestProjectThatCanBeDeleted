import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testPlayground {

    @Test
    public void testGetHelloWorldString () {
        Assertions.assertEquals(Playground.getHelloWorldString(), "HelloWorld");
        Assertions.assertNotEquals(Playground.getHelloWorldString(), "Hello World with a space");
    }
}
