public class GreatWhite extends Shark {
    public GreatWhite(String name){
        super(name);
    }

    @Override
    public Boolean canEat(Animal animal){
        if (this == animal || animal instanceof Canary){
            return false;
        } else {
            return true;
        }
    }
    

    @Override
    public void eat(Animal animal){
        if (animal instanceof Canary){
                System.out.println(getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
        }
        else if (canEat(animal)==false) {
            System.out.println(getName() + ": It's not worth my time.");
        } else {
            if (animal instanceof Shark){
                System.out.println(getName() + " ate a " + animal.getType() + " named " + animal.getName()+ ".");
                System.out.println(getName() + ": The best meal one could wish for.");
                smellBlood(false);
            } else { 
                System.out.println(getName() + " ate a " + animal.getType() + " named " + animal.getName());
            }
        }
        } 
        
    }
