import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @Test
    void getElem() {
        Container testContainer = new Container();
        testContainer.add(1);
        testContainer.add("R");
        Assertions.assertEquals("R", testContainer.getElem(1));
    }

    @Test
    void getSize() {
        Container testContainer = new Container();
        testContainer.add(3);
        testContainer.add("a");
        Assertions.assertEquals(2, testContainer.getSize());
    }

    @Test
    void add() {
        Container testContainer = new Container();
        testContainer.add("K");
        testContainer.add(5);
        assertEquals(2, testContainer.getSize());
        assertEquals("K", testContainer.getElem(0));
        assertEquals(5, testContainer.getElem(1));
    }

    @Test
    void remove() {
        Container testContainer = new Container();
        testContainer.add(5);
        testContainer.add(4);
        testContainer.add(10);
        testContainer.remove(2);
        testContainer.remove(1);
        testContainer.remove(0);
        assertEquals(0, testContainer.getSize());
    }
}