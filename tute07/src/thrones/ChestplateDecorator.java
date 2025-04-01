package thrones;

public class ChestplateDecorator extends CharacterDecorator {

    public ChestplateDecorator(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.damage(Math.min(points, 7));
    }

    @Override
    public boolean canMove(int dx, int dy) {
        return super.canMove(dx, dy) && (dx + dy <= 3);
    }
}
