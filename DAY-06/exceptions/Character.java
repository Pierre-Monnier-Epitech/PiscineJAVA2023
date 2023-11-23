public abstract class Character implements Movable {
    protected String name;
    protected final String RPGClass;
    protected int life= 50;
    protected int agility=2;
    protected int strength = 2;
    protected int wit= 2;

    public Character(String name,String RPGClass){
        this.name = name;
        this.RPGClass = RPGClass;
    }

    protected void attack(String arms) throws WeaponException {
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
        System.out.println(getName() + ": unsheathes his weapon.");
    }

    protected void tryToAttack(String arg){
        try {
            attack(arg);
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
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

}