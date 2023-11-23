public abstract class  Bread implements Food {
    
    protected int calorie;
    protected float price ;
    protected int bakingTime = 0;

    public Bread(int calorie, float prix){
        this.calorie = calorie;
        this.price = prix;
    }


    public int getCalories(){return calorie; }
    public float getPrice(){return price; }
    public int getBakingTime(){return bakingTime;}

}
