public abstract class Character implements Movable, Comparable<Character>{
    protected String name;
    protected final String RPGClass;
    protected int life= 50;
    protected int agility=2;
    protected int strength = 2;
    protected int wit= 2;
    protected int capacity = 0 ;

    public Character(String name,String RPGClass){
        this.name = name;
        this.RPGClass = RPGClass;
    }

    public Character(String name,String RPGClass, int capacity){
        this.name = name;
        this.RPGClass = RPGClass;   
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Character other){
        if (this.getClass() == other.getClass()){
            return Integer.compare(this.capacity,other.getCapacity());
        } else if (this instanceof Warrior && other instanceof Mage) {
            if (this.getCapacity() % other.getCapacity() == 0) {
                return 1; 
            } else {
                return -1; 
            }
        } else if (this instanceof Mage && other instanceof Warrior) {
            if (other.getCapacity() % this.getCapacity() == 0) {
                return -1; 
            } else {
                return 1;
            }
        } 
        else {
            return 0;
        }
    }    

    public void attack(String arms) {
        System.out.println(getName() + ": Rrrrrrrrr....");
    }

    public void moveRight(){
        System.out.println(getName() + " moves right");
    }

    public void moveLeft(){
        System.out.println(getName() +" moves left");
    }

    public void moveForward(){
        System.out.println(getName() +" moves forward");
    }

    public void moveBack(){
        System.out.println(getName() +" moves back");
    }

    public final void unsheathe(){
        System.out.println(getName() + "unsheathes his weapon.");
    }
    

    public String getName() {
        return name;
    }
    
    public String getRPGClass() {
        return RPGClass;
    }

    public int getAgility() {
        return agility;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public int getCapacity(){
        return capacity;
    }
}