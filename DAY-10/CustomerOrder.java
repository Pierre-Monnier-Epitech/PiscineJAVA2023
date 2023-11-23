import java.util.*;

public class CustomerOrder {
    
    protected Stock other;
    protected List<Food> orderItems =new ArrayList<>();
    protected List<Menu<? extends Drink, ? extends Food>> orderMenu = new ArrayList<>();


    public CustomerOrder(Stock stock){
        this.other = stock;
        orderItems = new ArrayList<>();
        orderMenu = new ArrayList<>();
    }

    public boolean addItem(Food food) throws NoSuchFoodException {
        Class<? extends Food> test = food.getClass();

        try {
            int stockQuantity = other.getNumberOf(test);
            if (stockQuantity > 0 ){
            orderItems.add(food);
            other.remove(test);
            return true;
            }
        } catch (NoSuchFoodException e) {
            System.out.println(e);
            return false;
        }
        return false;
    }

    public boolean removeItem(Food food) throws NoSuchFoodException {
        Class<? extends Food> test = food.getClass();
        if (orderItems.contains(food)) {
            orderItems.remove(food);
            other.add(test);
            return true;
        } else {
            return false; 
        }
    }

    public float getPrice(){
        float total = 0;

        for(Menu<? extends Drink, ? extends Food> menu : orderMenu ){
            total += menu.getPrice();
        }

        for(Food food : orderItems ){
            total += food.getPrice();
        }

        return total;
    }

    public boolean addMenu(Menu<? extends Drink, ? extends Food> menu){
     Class<? extends Food> classeMeal = menu.getMeal().getClass();
     Class<? extends Food> classeDrink = menu.getDrink().getClass();

    try {
        if (this.other.getNumberOf(classeDrink) >0 && this.other.getNumberOf(classeMeal)>0){
            this.other.remove(classeDrink);
            this.other.remove(classeMeal);
            orderMenu.add(menu);
            return true;
        } else {
            return false;
        }
    } catch (Exception e) {
        System.out.println(e);
        return false;
    }
    }

    public boolean removeMenu(Menu<? extends Drink, ? extends Food> menu){
     Class<? extends Food> classeMeal = menu.getMeal().getClass();
     Class<? extends Food> classeDrink = menu.getDrink().getClass();

    try {
        if (!orderMenu.contains(menu)){
            return false;
        }else {}
            if (this.other.getNumberOf(classeDrink) >0 && this.other.getNumberOf(classeMeal)>0){
                this.other.add(classeDrink);
                this.other.add(classeMeal);
                return true;
            } else {
                return false;
            }
    } catch (Exception e) {
        System.out.println(e);
        return false;
    }
    }


    public void printOrder(){
        System.out.println("Your order is composed of:");

        for (Menu<? extends Drink, ? extends Food> menu : orderMenu) {
            System.out.println("- " + menu.getClass().getName() + " menu ("+ menu.getPrice() +" euros)");
            System.out.println("-> drink: " + menu.getDrink().getClass().getName());
            System.out.println("-> meal: " + menu.getMeal().getClass().getName());
        }
    
        for (Food food : orderItems) {
            System.out.println("- " + food.getClass().getName() + " ("+ food.getPrice() +" euros)");
        }

        System.out.println("For a total of "+ getPrice() + " euros.");

    }
}