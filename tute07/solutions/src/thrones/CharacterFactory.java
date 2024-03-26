package thrones;

import java.util.Random;

public class CharacterFactory {
    private static final int RANGE = 5;

    public static int getRandomLoc() {
        Random rand = new Random();

        return rand.nextInt(RANGE);
    }

    public static Character createKing() {
        return new King(getRandomLoc(), getRandomLoc());
    }

    public static Character createQueen() {
        return new Queen(getRandomLoc(), getRandomLoc());
    }

    public static Character createKnight() {
        return new Knight(getRandomLoc(), getRandomLoc());
    }

    public static Character createDragon() {
        return new Dragon(getRandomLoc(), getRandomLoc());
    }
}