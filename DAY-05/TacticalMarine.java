public class TacticalMarine extends SpaceMarine {
    public TacticalMarine(String name) {
        super(name, 100, 20);
        System.out.println(name + " on duty.");
        equip(new PlasmaRifle());
    }

    @Override
    public void recoverAP() {
        if (ap + 9 > 20) {
            ap = 20;
        } else {
            ap += 9;
        }
    }

    
}