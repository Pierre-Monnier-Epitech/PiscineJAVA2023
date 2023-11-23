public class Warrior extends Character {
    public Warrior(String name){
        super(name, "Warrior");
        this.life = 100;
        this.strength =10;
        this.agility =8;
        this.wit =3;
        System.out.println(getName() + ": My name will go down in history!");
    }

    @Override
    public void attack(String arms) throws WeaponException {
        if (arms.equals("")) {
            throw new WeaponException(getName() + ": I refuse to fight with my bare hands.");
        } else if (arms.equalsIgnoreCase("hammer") || arms.equalsIgnoreCase("sword")) {
            System.out.println(this.name + ": Rrrrrrrrr....");
            System.out.println(this.name + ": I'll crush you with my " + arms + "!");
        } else {
            throw new WeaponException(getName() + ": A " + arms + "?? What should I do with this?!");
        }
    }

    @Override
    public void moveRight(){
        System.out.println(getName() + ": moves right like a bad boy.");
    }

    @Override
    public void moveLeft(){
        System.out.println(getName() +": moves left like a bad boy.");
    }

    @Override
    public void moveForward(){
        System.out.println(getName() +": moves forward like a bad boy.");
    }

    @Override
    public void moveBack(){
        System.out.println(getName() +": moves back like a bad boy.");
    }
}
