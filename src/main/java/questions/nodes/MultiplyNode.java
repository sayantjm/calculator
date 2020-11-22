package questions.nodes;

/**
 * Created by sayantjm on 22/11/20
 * This type of RNode is used for the product operator.
 * Calculation has been updated to multiply both, left and right, node values.
 */
public class MultiplyNode extends RNode {
    public MultiplyNode(int value) {
        super("*", value);
    }

    public int calculate(){
        if ((leftNode == null) || (rightNode == null) ) {
            throw new IllegalArgumentException("Node is not defined.");
        }
        return leftNode.calculate()*rightNode.calculate();
    }
}
