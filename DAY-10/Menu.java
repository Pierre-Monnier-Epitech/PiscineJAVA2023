    public abstract class Menu<D extends Food, M extends Food> {

        protected D drink;
        protected M meal;

        public float getPrice(){
            float total = drink.getPrice() + meal.getPrice();
            return total * 0.9f; 
        }

        public Menu(D boire,M meal){
            this.drink = boire;
            this.meal = meal;
        }

        public D getDrink(){return drink;}
        public M getMeal(){return meal;}

    }
