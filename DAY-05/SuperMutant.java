public class SuperMutant extends Monster {
    public static int nbSuperMutant = 0 ;

    public SuperMutant(){
        super("SuperMutant #" + nbSuperMutant,170,20);
        this.damage = 60;
        this.apcost = 20;
        System.out.println(getName()+ " Crrr!");

    }

    @Override
    public void recoverAP(){
        if (this.ap + 7 > 20 && this.hp + 10 > 170){
            this.ap = 20;
            this.hp =170;
        } else if (this.ap +7 > 20 && this.hp + 10 < 170){
            this.ap = 20;
            this.hp +=10;
        } else if (this.hp + 10 > 170 && this.ap + 7 > 20 ){
            this.hp =170;
            this.ap +=7; 
        } else {
            this.ap +=7;
            this.hp +=10;
        }
    }
}

