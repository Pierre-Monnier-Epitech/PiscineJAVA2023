public class RadScorpion extends Monster {
    public static int nbScorpion = 0 ;

    public RadScorpion(){
        super("RadScorpion #" + nbScorpion,80,50);
        this.damage=25;
        this.apcost=8;
        System.out.println(getName()+ " Crrr!");

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
                    if (fighter instanceof SpaceMarine && !(fighter instanceof AssaultTerminator)){
                        fighter.receiveDamage(damage);
                    } else {
                        fighter.receiveDamage(damage*2);
                    }
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
}
