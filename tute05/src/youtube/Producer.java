import java.util.ArrayList;
import java.util.List;

public class Producer implements Subject {
    private String name;
    private List<Observer> observers = new ArrayList();
    private List<Video> videos = new ArrayList();

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public void add(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void remove(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notify(Video vid) {
        for (Observer obs : observers) {
            obs.update(vid);
        }
    }

    public static void main(String[] args) {
        Producer prod = new Producer("tony");
        User user = new User("Bob");

        prod.add(user);

        Video vid = new Video("Comp2511", 11, prod);

        prod.notify(vid);

        prod.remove(user);
    }
}
