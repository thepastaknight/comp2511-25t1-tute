public class Computer implements ComputerComponent {
    private String name;
    private int memory;
    private ComputerVisitor validated = null;

    public Computer(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    public void validate(ComputerVisitor visitor) {
        this.validated = visitor;
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        if (visitor != validated) {
            return;
        }
        visitor.visit(this);
    }
}
