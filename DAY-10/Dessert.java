public abstract class Dessert implements Food{

    protected int calorie;
    protected float price ;

    public Dessert(int calorie, float prix){
        this.calorie = calorie;
        this.price = prix;
    }
  
    public int getCalories(){return calorie; }
    public float getPrice(){return price; }
}
