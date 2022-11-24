package modelElements;

public class Texture {
    static int counter = 0;

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Texture(String name) {
        this.name = name;
    }

    {
        id = ++counter;
    }
}
