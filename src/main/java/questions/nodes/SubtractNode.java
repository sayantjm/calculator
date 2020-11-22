package questions.nodes;

/**
 * Created by sayantjm on 22/11/20
 * This type of RNode is used for the subtraction operator.
 * Calculation has been updated to subtract both, left and right, node values.
 */
public class SubtractNode extends RNode {
    public SubtractNode(int value) {
        super("-", value);
    }

    public int calculate(){
        if ((leftNode == null) || (rightNode == null) ) {
            throw new IllegalArgumentException("Node is not defined.");
        }
        return leftNode.calculate()-rightNode.calculate();
    }
}
