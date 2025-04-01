package thrones;

public class Game {
    private List<AbstractCharacter> characters = new ArrayList<AbstractCharacter>();

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        for (AbstractCharacter character : characters) {
            System.out.print("Move " + character + " to: ");
            String[] line = scanner.nextLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);

            MoveResult result = character.makeMove(x, y, characters);

            if (result.equals(MoveResult.SUCCESS)) {
                System.out.println("Success! Character is now " + character);
            } else if (result.equals(MoveResult.INVALID)) {
                System.out.println("Invalid move.");
            } else if (result.equals(MoveResult.ATTACK)) {
                System.out.println("Attacked another character.");
            }
        }

        scanner.close();
    }

    public void addCharacter(AbstractCharacter character) {
        characters.add(character);
    }

    public static void main(String[] args) {
        // Replace constructors below with factory pattern
        Game game = new Game();
        game.addCharacter(CharacterFactory.createKing());
        game.addCharacter(CharacterFactory.createDragon());
        game.addCharacter(CharacterFactory.createQueen());

        King k = CharacterFactory.createKing();

        Character decoratoratedKing = new ChainmailDecorator(new ChestplateDecorator(new HelmetDecorator(k)));
        decoratoratedKing.removeDecorator().removeDecorator().removeDecorator();

        game.play();
    }
}
