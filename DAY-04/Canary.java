public class Canary extends Animal{
    
    private int eggs ;


    public Canary(String name) {
        super(name,0,Type.BIRD);

        System.out.println("Yellow and smart? Here I am!");
        this.eggs = 0;
    }

    public int getEggsCount(){
        return eggs;
    }

    public void layEgg(){
        eggs++;
    }

}
