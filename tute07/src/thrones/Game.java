package thrones;

public class Game {
    
    public static void main(String[] args) {
        King king = new King(1, 2);
        Queen queen = new Queen(3, 4);
        Knight knight = new Knight(1, 3);
        Dragon dragon = new Dragon(3, 1);

        knight.attack(dragon);

        Component comp = king;
        comp = new Helmet(king);
        comp = new Chainmail(comp);

        comp.damage(4);
    }

}