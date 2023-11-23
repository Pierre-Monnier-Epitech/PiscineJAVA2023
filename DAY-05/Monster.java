abstract class Monster extends Unit{
    protected int damage = 0 ;
    protected int apcost = 0 ;

    protected Monster(String name, int hp, int ap){
        super(name,hp,ap);
    }

    @Override
    public boolean equip(Weapon weapon){
        if (getHp() <=0 ) {
            return false;
        } else {
            System.out.println("Monsters are proud and fight with their own bodies.");
            return false;
        }
    }

    @Override
    public boolean attack(Fighter fighter){
        if (getHp() <=0 ) {
            return false;
        } else {
            if (getCloseTo() == fighter){
                if (this.apcost <= this.ap){
                    this.ap -= this.apcost;
                    System.out.println(getName() + " attacks " + fighter.getName());
                    fighter.receiveDamage(damage);
                    return true;
                }else {
                return false;
                }
            }
            else {
                System.out.println(getName() + ": I'm too far away from "+ fighter.getName());
                return false;
            }
         }
    }



    public int getDamage(){return this.damage;}
    public int getApcost(){return this.apcost;}

}
