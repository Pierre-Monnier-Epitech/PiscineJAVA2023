public abstract class Drink implements Food {
    protected boolean aCan = false;
    protected int calorie;
    protected float price ;

    

    public Drink(int calorie, float prix, boolean aCan){
        this.calorie = calorie;
        this.price = prix;
        this.aCan = aCan;
    }
  
    public int getCalories(){return calorie; }
    public float getPrice(){return price; }
    public boolean isACan(){return this.aCan; }
}
