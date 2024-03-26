public class Video {
    private String name;
    private int length;
    private Producer prod;

    public Video(String name, int length, Producer prod) {
        this.name = name;
        this.length = length;
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "Video [name=" + name + ", length=" + length + "]";
    }


    
}
