package calculator;

public class Divide implements Node {

    private Node left;
    private Node right;

    public Divide(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }

    @Override
    public String prettyPrint() {
        return "(" + left.prettyPrint() + " / " + right.prettyPrint() + ")";
    }
}
