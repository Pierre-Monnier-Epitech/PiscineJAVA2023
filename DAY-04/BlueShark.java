public class BlueShark extends Shark {
    public BlueShark(String name){
        super(name);
    }

    @Override
    public Boolean canEat(Animal animal){
        if (this != animal && animal.getType().equalsIgnoreCase(Type.FISH.toString())){
            return true;
        } else {
            
            return false;

        }
    }
}
