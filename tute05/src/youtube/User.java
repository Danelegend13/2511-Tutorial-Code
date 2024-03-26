public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Video video) {
        System.out.println("Received video " + video.toString());
    }
}
