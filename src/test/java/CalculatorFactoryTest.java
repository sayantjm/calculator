import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import questions.factory.NodeFactory;
import questions.factory.NodeStore;
import questions.nodes.RNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sayantjm on 22/11/20
 */
public class CalculatorFactoryTest {
    private NodeFactory factory;
    private NodeStore nodeStore;

    @BeforeEach
    public void setup() {
        factory = new NodeFactory();
        nodeStore = new NodeStore(factory);
    }

    @Test
    public void multiplyTest() {
        RNode times = nodeStore.createNode("*",0);
        RNode three = nodeStore.createNode(null, 3);
        RNode four = nodeStore.createNode(null, 4);

        // first 3 * 4
        times.setLeftNode(three);
        times.setRightNode(four);
        assertEquals(12, times.calculate());
    }

    @Test
    public void sumTest() {
        RNode times = nodeStore.createNode("+",0);
        RNode three = nodeStore.createNode(null, 3);
        RNode four = nodeStore.createNode(null, 4);

        // 3 + 4
        times.setLeftNode(three);
        times.setRightNode(four);
        assertEquals(7, times.calculate());
    }

    @Test
    public void multipleOperationsTest() {
        //5 + 10 * 7
        RNode times = nodeStore.createNode("*",0);
        RNode ten = nodeStore.createNode(null, 10);
        RNode seven = nodeStore.createNode(null, 7);

        // 10 * 7
        times.setLeftNode(ten);
        times.setRightNode(seven);
        assertEquals(70, times.calculate());

        // 5 + 70
        RNode plus = nodeStore.createNode("+", 0);
        RNode five = nodeStore.createNode(null, 5);

        plus.setLeftNode(five);
        plus.setRightNode(times);
        assertEquals(75, plus.calculate());
    }

    @Test
    public void substractTest() {
        RNode times = nodeStore.createNode("-",0);
        RNode eight = nodeStore.createNode(null, 8);
        RNode four = nodeStore.createNode(null, 4);

        // 8 - 4
        times.setLeftNode(eight);
        times.setRightNode(four);
        assertEquals(4, times.calculate());
    }

    @Test
    public void negativeSubstractionTest() {
        // 4 - 8
        RNode times = nodeStore.createNode("-",0);
        RNode eight = nodeStore.createNode(null, 8);
        RNode four = nodeStore.createNode(null, 4);

        // 8 - 4
        times.setLeftNode(four);
        times.setRightNode(eight);
        assertEquals(-4, times.calculate());
    }

}
