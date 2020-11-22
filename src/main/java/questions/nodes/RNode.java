package questions.nodes;

/**
 * Created by sayantjm on 22/11/20
 * Abstract class created for replacing the original Node
 * The method calculate will be overwrited by the concret classes
 * specifying how the calculation must be done.
 *
 */
abstract public class RNode {
    String operator;
    int value;
    RNode leftNode;
    RNode rightNode;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public RNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(RNode leftNode) {
        this.leftNode = leftNode;
    }

    public RNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(RNode rightNode) {
        this.rightNode = rightNode;
    }

    public RNode(int value) {
        this.value = value;
    }

    public RNode(String operator, int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int calculate(){
        return value;
    }
}
