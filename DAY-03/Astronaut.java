
public class Astronaut {

    private final String name;
    private int snacks = 0;
    private String destination = null;
    private final int id;
    private static int ids = 0;

    public Astronaut(String name) {
        this.name = name;
        this.id = ids++;
        System.out.println("%s ready for launch!".formatted(this.name));
    }

    public int getId() {
        return this.id;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getName() {
        return this.name;
    }

    public int getSnacks() {
        return this.snacks;
    }

    public void doActions() {
        System.out.println("%s: Nothing to do.".formatted(this.name));
        if (this.destination == null) {
            System.out.println("%s: I may have done nothing, but I have %s Mars to eat at least!".formatted(this.name, this.snacks));
        }
    }

    public void doActions(planet.Mars obj) {
        System.out.println("%s: Started a mission!".formatted(this.name));
        this.destination = obj.getLandingSite();
    }

    public void doActions(planet.moon.Phobos obj) {
        System.out.println("%s: Started a mission!".formatted(this.name));
        this.destination = obj.getLandingSite();
    }

    public void doActions(chocolate.Mars obj) {
        System.out.println("%s: Thanks for this mars number %s".formatted(this.name, obj.getId()));
        this.snacks++;
        if (this.destination == null) {
            System.out.println("%s: I may have done nothing, but I have %s Mars to eat at least!".formatted(this.name, this.snacks));
        }
    }
}
