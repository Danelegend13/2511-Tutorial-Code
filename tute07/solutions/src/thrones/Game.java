package thrones;

public class Game {
    
    public static void main(String[] args) {

        Character king = CharacterFactory.createKing();
        Character queen = CharacterFactory.createQueen();
        Character knight = new Knight(2, 4);
        Character dragon = new Dragon(1, 4);

        knight.attack(dragon);
    }

}