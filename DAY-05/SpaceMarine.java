abstract class SpaceMarine extends Unit {
    protected int damage = 0 ;
    protected int apcost = 0 ;

    public Weapon weapon;

    protected SpaceMarine(String name, int hp, int ap){
        super(name,hp,ap);
    }

    @Override
    public boolean equip(Weapon weapon){
        if (getHp() <=0 ) {
            return false;
        } else {
            if (weapon.getEquipped() == false){
                System.out.println(getName() + " has been equipped with a " + weapon.getName());
                weapon.setEquipped(true);
                return true;
            }
            return false;
        }
    }

    @Override
    public boolean attack(Fighter fighter){
        if (getHp() <=0 ) {
            return false;
        } else {
            if (weapon.getEquipped() == false){
               System.out.println(getName() + ": Hey, this is crazy. I'm not going to fight this empty-handed");
               return false;
            } else {
                if (weapon.isMelee()) {
                        System.out.println(getName() + ": I'm too far away from "+ fighter.getName());
                        return false;
                }  else {
                    if (this.apcost <= this.ap){
                        this.ap -= this.weapon.getApcost();
                        fighter.receiveDamage(this.weapon.getDamage());
                        System.out.println(getName() + " attacks " + fighter.getName());
                        this.weapon.attack();
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }
    
    @Override
    public boolean moveCloseTo(Fighter fighter){
        if (getHp() <=0 ) {
            return false;
        } else {
            if (this != fighter || CloseTo != fighter || !this.weapon.isMelee()){
                System.out.println(this.name + " is moving closer to "+ fighter.getName());
                this.CloseTo = fighter;
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public void recoverAP(){
        if (getAp() + 9 > 50){
            this.ap = 50;
        } else {
            this.ap +=9;
        }
    }
    
    public Weapon getWeapon() { return this.weapon;}
    public int getDamage(){return this.damage;}
    public int getApcost(){return this.apcost;}
}
