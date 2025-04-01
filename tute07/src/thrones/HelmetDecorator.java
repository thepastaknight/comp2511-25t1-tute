package thrones;

public class HelmetDecorator extends CharacterDecorator {
    public HelmetDecorator(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.damage(Math.max(0, points - 1));
    }
}
