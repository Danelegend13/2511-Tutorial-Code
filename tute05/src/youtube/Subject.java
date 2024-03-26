public interface Subject {
    public void add(Observer obs);

    public void remove(Observer obs);

    public void notify(int metric);
}
