package questions.factory;

import questions.nodes.*;

/**
 * Created by sayantjm on 22/11/20
 */
public class NodeFactory {
    public RNode createNode(String operator, int value) {
        RNode node = null;

        if ("+".equals(operator)) {
            node = new SumNode(value);
        } else if ("*".equals(operator)) {
            node = new MultiplyNode(value);
        } else if ("-".equals(operator)) {
            node = new SubstractNode(value);
        } else {
            node = new NumberNode(value);
        }
        return node;
    }
}
