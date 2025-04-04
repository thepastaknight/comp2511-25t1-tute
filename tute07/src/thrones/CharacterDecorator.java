package thrones;

import java.util.List;

public class CharacterDecorator implements Character {

    private Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public int getHealthPoints() {
        return character.getHealthPoints();
    }

    @Override
    public int getX() {
        return character.getX();
    }

    @Override
    public int getY() {
        return character.getY();
    }

    @Override
    public void damage(int points) {
        character.damage(points);
    }

    @Override
    public MoveResult makeMove(int x, int y, List<AbstractCharacter> characters) {
        return character.makeMove(x, y, characters);
    }

    @Override
    public void attack(AbstractCharacter victim) {
        character.attack(victim);
    }

    @Override
    public boolean canMove(int dx, int dy) {
        return character.canMove(dx, dy);
    }

    @Override
    public Character removeDecorator() {
        return character;
    }
}
