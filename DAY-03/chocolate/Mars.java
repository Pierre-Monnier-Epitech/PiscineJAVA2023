package chocolate;

public class Mars {
    // static partagé entre tous les objets
    private static int ids = 0;
    private final int id;

    public Mars() {
        this.id = ids;
        ids++;
    }

    public int getId() {
        return this.id;
    }
}
