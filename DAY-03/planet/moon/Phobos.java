package planet.moon;

public class Phobos {

    private planet.Mars mars=null;
    private String landingSite=null;

    public Phobos(planet.Mars mars, String landingSite) {
        this.mars = mars;
        this.landingSite = landingSite;
        System.out.println("Phobos placed in orbit.");
    }

    public planet.Mars getMars() {
        return this.mars;
    }

    public String getLandingSite() {
        return this.landingSite;
    }
}
