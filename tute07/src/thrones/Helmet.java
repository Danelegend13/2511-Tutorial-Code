package thrones;

public class Helmet extends Decorator {
    public Helmet(Component comp) {
        super(comp);
    }

    @Override
    public void damage(int points) {
        int reducedDmg = points - 1;

        super.getComponent().damage(reducedDmg);
    }

    
}
