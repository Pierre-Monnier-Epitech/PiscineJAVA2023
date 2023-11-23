import java.util.*;

public class Stock {
    
    protected Map<Class<? extends Food>, Integer> stock;
    List<Class<? extends Food>> classes = new ArrayList<>();


    public Stock(){

        classes.add(AppleSmoothie.class);
        classes.add(Bread.class);
        classes.add(CheeseCake.class);
        classes.add(Coke.class);
        classes.add(Cookie.class);
        classes.add(FrenchBaguette.class);
        classes.add(HamSandwich.class);
        classes.add(Panini.class);
        classes.add(Sandwich.class);
        classes.add(SoftBread.class);

        stock = new HashMap<>();
        for(Class<? extends Food> classe : classes){
            stock.put(classe,100);
        }

    }

    public int getNumberOf(Class<? extends Food> nombre) throws NoSuchFoodException{
        if (stock.get(nombre) == null) {
            throw new NoSuchFoodException("No such food type: " + nombre.getName()+ ".");
        } else {
            return stock.get(nombre);
        }
            
    }

    public boolean add(Class<? extends Food> ajouter) throws NoSuchFoodException{
        if (stock.get(ajouter) == null) {
            throw new NoSuchFoodException("No such food type: " + ajouter.getName() + ".");
        } else {
            if ( stock.get(ajouter) != null ){
                stock.put(ajouter,stock.get(ajouter)+1);
                return true;
            } else {
                return false;
            }
    }}

    public boolean remove(Class<? extends Food> supprimer) throws NoSuchFoodException{
        if (stock.get(supprimer) == null) {
            throw new NoSuchFoodException("No such food type: " + supprimer.getName());
        } else {
            if ( stock.get(supprimer) != 0 ){
                if ( stock.get(supprimer) != null  ){
                    stock.put(supprimer,stock.get(supprimer)-1);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
} 
