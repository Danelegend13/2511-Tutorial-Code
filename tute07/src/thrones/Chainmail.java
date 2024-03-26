package thrones;

public class Chainmail extends Decorator {
    public Chainmail(Component comp) {
        super(comp);
    }

    public void damage(int dmg) {
        int reducedDmg = (int) Math.floor(dmg / 2);

        super.getComponent().damage(reducedDmg);
    }
    
}
