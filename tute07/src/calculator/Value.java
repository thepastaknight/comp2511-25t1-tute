package calculator;

public class Value implements Node {

    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String prettyPrint() {
        return Integer.toString(value);
    }
}
