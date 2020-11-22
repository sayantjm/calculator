package questions.factory;

import questions.nodes.RNode;

/**
 * Created by sayantjm on 22/11/20
 * NodeStore is the class that will provide the node Creation
 * The current example is simple, but it can be abstracted
 * and create different types of Factories depending on the
 * information provided
 */
public class NodeStore {
    NodeFactory factory;

    public NodeStore(NodeFactory factory) { this.factory = factory;}

    public RNode createNode(String operator, int value) {
        if (factory == null) {
            factory = new NodeFactory();
        }

        return factory.createNode(operator, value);
    }
}
