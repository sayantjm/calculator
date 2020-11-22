package questions.factory;

import questions.nodes.RNode;

/**
 * Created by sayantjm on 22/11/20
 */
public class NodeFactoryMain {
    public static void main(String[] args) {
        NodeFactory factory = new NodeFactory();
        NodeStore nodeStore = new NodeStore(factory);

        NodeFactoryMain calculator = new NodeFactoryMain();
        calculator.run(nodeStore);
    }

    public void run(NodeStore store) {
        // 2 + 3 * 4
        RNode times = store.createNode("*", 0);
        RNode three = store.createNode(null, 3);
        RNode four = store.createNode(null, 4);

        // first 3 * 4
        times.setLeftNode(three);
        times.setRightNode(four);

        // then 2 + result above
        RNode two = store.createNode(null, 2);
        RNode plus = store.createNode("+",0);

        plus.setLeftNode(two);
        plus.setRightNode(times);
        System.out.println(plus.calculate());
    }
}
