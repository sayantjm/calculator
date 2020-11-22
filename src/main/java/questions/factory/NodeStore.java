package questions.factory;

import questions.nodes.RNode;

/**
 * Created by sayantjm on 22/11/20
 */
public class NodeStore {
    NodeFactory factory;

    public NodeStore(NodeFactory factory) { this.factory = factory;}

    public RNode createNode(String operator, int value) {
        return factory.createNode(operator, value);
    }
}
