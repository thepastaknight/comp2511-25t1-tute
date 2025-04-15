public class ComputerVisitor {

    public void visit(Computer computer) {
        System.out.println("Looking at " + computer.toString() + " with memory " + computer.getMemory() + " GB.");
    }

    public void visit(Keyboard keyboard) {
        // Similar to above
    }

    public void visit(Mouse mouse) {
        // Similar to above
    }

    public static void main(String[] args) {
        Computer computer = new Computer("Corelli", 500);
        Keyboard keyboard = new Keyboard("Mechanical keyboard");
        Mouse mouse = new Mouse("Bluetooth mouse");
        ComputerVisitor visitor = new ComputerVisitor();

        computer.accept(visitor);
        computer.validate(visitor);
        computer.accept(visitor);
        keyboard.accept(visitor);
        mouse.accept(visitor);
    }
}
