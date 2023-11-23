public class AssaultTerminator extends SpaceMarine {
    public AssaultTerminator(String name) {
        super(name, 150, 30);
        System.out.println(name + " has teleported from space.");
        equip(new PowerFist());
    }

    @Override
    public void receiveDamage(int damage) {
        if (damage > 3 ){
            if (this.hp - damage + 3 <= 0) {
                this.hp = 0;
            } else {
                this.hp -= damage + 3;
            }
        }
    }
}