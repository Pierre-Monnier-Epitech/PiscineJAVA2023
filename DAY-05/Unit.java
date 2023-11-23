public abstract class Unit implements Fighter {
    protected String name;
    protected int hp;
    protected int ap;
    protected Fighter CloseTo = null;

    protected Unit(String name, int hp, int ap){
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }
    
    @Override
    public void receiveDamage(int damage){
        if (this.hp > 0){ 
            this.hp -= damage;
        }
    }


    @Override
    public boolean moveCloseTo(Fighter fighter){
        if (getHp() <=0 ) {
            return false;
        } else {
            if (this != fighter || CloseTo != fighter){
                
                this.CloseTo = fighter;
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public void recoverAP(){
        if (getAp() + 7 > 50){
            this.ap = 50;
        } else {
            this.ap +=7;
        }
    }

    public String getName(){return this.name;}

    @Override
    public int getHp(){ return this.hp;}

    public Fighter getCloseTo() { return this.CloseTo;}
    public int getAp(){ return this.ap;}        
}
