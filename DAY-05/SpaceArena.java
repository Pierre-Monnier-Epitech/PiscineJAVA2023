import java.util.ArrayList;
import java.util.List;

public class SpaceArena {
    private List<Fighter> registeredFighters;

    public SpaceArena() {
        registeredFighters = new ArrayList<>();
    }

    public void enlistMonsters(List<Monster> monsters) {
        for (Monster monster : monsters) {
            if (!registeredFighters.contains(monster)) {
                registeredFighters.add(monster);
            }
        }
    }

    public void enlistSpaceMarines(List<SpaceMarine> spaceMarines) {
        for (SpaceMarine marine : spaceMarines) {
            if (!registeredFighters.contains(marine)) {
                registeredFighters.add(marine);
            }
        }
    }


    public boolean fight() {
        if (registeredFighters.isEmpty()) {
            System.out.println("No fighters available to fight.");
            return false;
        }

        List<Monster> monsters = new ArrayList<>();
        List<SpaceMarine> spaceMarines = new ArrayList<>();

        for (Fighter fighter : registeredFighters) {
            if (fighter instanceof Monster) {
                monsters.add((Monster) fighter);
            } else if (fighter instanceof SpaceMarine) {
                spaceMarines.add((SpaceMarine) fighter);
            }
        }

        if (monsters.isEmpty()) {
            System.out.println("No monsters available to fight.");
            return false;
        }

        if (spaceMarines.isEmpty()) {
            System.out.println("Those cowards ran away.");
            return false;
        }

        while (!monsters.isEmpty() && !spaceMarines.isEmpty()) {
            Fighter monster = monsters.get(0);
            Fighter spaceMarine = spaceMarines.get(0);
            System.out.println(spaceMarine.getName() + " has entered the arena.");
            System.out.println(monster.getName() + " has entered the arena.");

            while (monster.getHp() !=0 || spaceMarine.getHp() !=0) {
                if (Math.random() < 0.5) { 
                monster.attack(spaceMarine);
                } else {
                spaceMarine.attack(monster);
                }
            }

            if (monster.getHp() ==0) {
            System.out.println(spaceMarine.getName() + " wins!");
                spaceMarine.recoverAP();
                monsters.remove(0);
            }
                else {
                System.out.println(monster.getName() + " wins!");
                monster.recoverAP();
                spaceMarines.remove(0);
                }
        
        }
        if (monsters.isEmpty()) {
            System.out.println("The monsters are victorious.");
        } else {
            System.out.println("The spaceMarines are victorious.");
        }
        return true;
    }
    
}
