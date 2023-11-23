public class Shark extends Animal{

    private boolean frenzy = false ;

    public Shark(String name ) {
        super(name,0,Type.FISH);

        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(boolean frenzy){
        this.frenzy = frenzy;
    }

    public void status(){
        if (this.frenzy == false ){
            System.out.println(getName() + " is swimming peacefully.");
        } else {
            System.out.println(getName()+ " is smelling blood and wants to kill.");
        }
    }

    public Boolean canEat(Animal animal){
        if (this == animal){
            return false;
        } else {
            return true;
        }
    }

    public void eat(Animal animal){
        if (canEat(animal)==false) {
            System.out.println(getName() + ": It's not worth my time.");
        } else {
            System.out.println(getName() + " ate a " + animal.getType() + " named " + animal.getName()+ ".");
            this.frenzy= false;
        }
    }
}
