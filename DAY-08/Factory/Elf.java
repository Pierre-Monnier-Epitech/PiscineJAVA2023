package Factory;

import java.util.ArrayList;
import java.util.List;

public class Elf {
    private Toy toy;
    private List<GiftPaper> papers = new ArrayList<>();
    private Factory factory;
 
    public Elf(Factory factory){
        this.factory = factory;
    }

    public boolean pickToy(String toyName) {
        if (toy == null) {
            try {
                toy = factory.create(toyName);
                System.out.println("What a nice one! I would have liked to keep it...");
                return true;
            } catch (NoSuchToyException e) {
                System.out.println("I didn't find any " + toyName);
            }
        } else {
            System.out.println("Minute please?! I'm not that fast.");
        }
        return false;
    }

    public boolean pickPapers(int x) {
        papers = factory.getPapers(x);
        return true;
    }

    public GiftPaper pack() {
       
        
        if (this.papers.isEmpty() || this.papers == null) {

            System.out.println("Wait... I can't pack it with my shirt.");
            return null;

        } else if (this.toy == null) {

            System.out.println("I don't have any toy, but hey at least it's paper!");
            return null;

        } else {

            GiftPaper packedToy = this.papers.get(0);

            this.papers.remove(0);
            
            packedToy.wrap(this.toy);

            System.out.println("And another kid will be happy!");
            return packedToy;

        }
    }

}

