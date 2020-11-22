package questions.nodes;

/**
 * Created by sayantjm on 22/11/20
 */
public class SumNode extends RNode {
    public SumNode(int value) {
        super("+", value);
    }

    public int calculate(){
        return leftNode.calculate()+rightNode.calculate();
    }
}
