
import java.util.ArrayList;

public class Team {

    private final String name;
    private final ArrayList<Astronaut> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void add(Astronaut member) {
        this.members.add(member);
    }

    public void remove(Astronaut member) {
        this.members.remove(member);
    }

    public int countMembers() {
        return this.members.size();
    }

    public void showMembers() {
        System.out.print("%s: ".formatted(this.name));
        for (int i = 0; i < this.countMembers(); i++) {
            Astronaut member = this.members.get(i);
            System.out.print("%s".formatted(member.getName()));
            if (member.getDestination() != null) {
                System.out.print(" on mission");
            } else {
                System.out.print(" on standby");
            }
            if (this.countMembers() > i + 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }

    public void doActions() {
        System.out.println("%s: Nothing to do.".formatted(this.name));
    }

    public void doActions(planet.Mars obj) {
        for (Astronaut member : this.members) {
            member.doActions(obj);
        }
    }

    public void doActions(planet.moon.Phobos obj) {
        for (Astronaut member : this.members) {
            member.doActions(obj);
        }
    }

    public void doActions(chocolate.Mars obj) {
        for (Astronaut member : this.members) {
            member.doActions(obj);
        }
    }
}
