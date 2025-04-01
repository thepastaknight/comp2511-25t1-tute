package thrones;

import java.util.List;

public interface Character {
    public int getHealthPoints();

    public int getX();

    public int getY();

    /**
     * Cause this character the given amount of damage.
     * 
     * @param points
     */
    public void damage(int points);

    /**
     * Attempts to make a move to a square in the game, given all of the characters
     * If it is an invalid move, returns INVALID.
     * If it is a valid move but the square is occupied, attacks the character and
     * returns ATTACK
     * If it is a valid move and the square is free, returns SUCCESS
     */
    public MoveResult makeMove(int x, int y, List<AbstractCharacter> characters);

    /**
     * This character attacks the given victim, causing them damage according to
     * their rules.
     * 
     * @param victim
     */
    public void attack(AbstractCharacter victim);

    /**
     * Can this character move by the given amount along the x and y axes.
     * 
     * @param x
     * @param y
     * @return True if they can move by that amount, false otherwise
     */
    public boolean canMove(int dx, int dy);

    public Character removeDecorator();
}
