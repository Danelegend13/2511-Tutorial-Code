package thrones;

public abstract class Decorator implements Component {
    private Component comp;

    public Decorator(Component comp) {
        this.comp = comp;
    }

    public Component getComponent() {
        return this.comp;
    }
}
