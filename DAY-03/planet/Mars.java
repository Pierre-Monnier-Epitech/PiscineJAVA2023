package planet;

public class Mars {
    // static partagé entre tous les objets
    private static int ids = 0;
    private final int id;
    private final String landingSite;

    public Mars(String landingSite) {
        this.id = ids;
        ids++;
        this.landingSite = landingSite;
    }

    public String getLandingSite() {
        return this.landingSite;
    }

    public int getId() {
        return this.id;
    }
}
