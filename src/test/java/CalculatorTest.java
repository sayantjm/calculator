import org.junit.jupiter.api.Test;
import questions.original.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sayantjm on 22/11/20
 */
public class CalculatorTest {

    @Test
    public void multiplyTest() {
        Node times = new Node("*",0);
        Node three = new Node(null, 3);
        Node four = new Node(null, 4);

        // first 3 * 4
        times.setLeftNode(three);
        times.setRightNode(four);
        assertEquals(12, times.calculate());
    }

    @Test
    public void sumTest() {
        Node times = new Node("+",0);
        Node three = new Node(null, 3);
        Node four = new Node(null, 4);

        // 3 + 4
        times.setLeftNode(three);
        times.setRightNode(four);
        assertEquals(7, times.calculate());
    }

    @Test
    public void multipleOperationsTest() {
        //5 + 10 * 7
        Node times = new Node("*",0);
        Node ten = new Node(null, 10);
        Node seven = new Node(null, 7);

        // 10 * 7
        times.setLeftNode(ten);
        times.setRightNode(seven);
        assertEquals(70, times.calculate());

        // 5 + 70
        Node plus = new Node("+", 0);
        Node five = new Node(null, 5);

        plus.setLeftNode(five);
        plus.setRightNode(times);
        assertEquals(75, plus.calculate());
    }

    @Test
    public void substractNotAvailableTest() {
        Node times = new Node("-",0);
        Node eight = new Node(null, 8);
        Node four = new Node(null, 4);

        // 8 - 4
        times.setLeftNode(eight);
        times.setRightNode(four);
        assertEquals(0, times.calculate());
    }

}
