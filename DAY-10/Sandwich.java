import java.util.ArrayList;

public abstract class Sandwich implements Food {
    
    protected boolean vegetarian = false;
    protected ArrayList<String> ingredients = new ArrayList<String>();
    protected int calorie;
    protected float price ;

    public Sandwich(int calorie, float prix , boolean vegetarian){
        this.calorie = calorie;
        this.price = prix;
        this.vegetarian = vegetarian;
    }

    public int getCalories(){return calorie; }
    public float getPrice(){return price; }
    public ArrayList<String> getIngredients(){return ingredients;}
    public boolean isVegetarian(){return vegetarian;}

}
