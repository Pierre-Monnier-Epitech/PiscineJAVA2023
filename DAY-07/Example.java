import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Mage> mages = new ArrayList<>();
        mages.add(new Mage("Merlin",12));
        List<Warrior> warriors = new ArrayList<>();
        warriors.add(new Warrior("Achilles",240));
        Battalion battalion = new Battalion();
        List<Mage> test = new ArrayList<>();
        test.add(new Mage("Sauron",241));
        battalion.add(mages);
        battalion.add(warriors);
        System.out.println("===========");
        battalion.display();
        battalion.fight();
        System.out.println("===========");
        battalion.display(); // Merlin is removed
        battalion.add(test);
        System.out.println("===========");
        battalion.display();
        battalion.fight();
        System.out.println("===========");
        battalion.display();
    }
}