public class Example {
        public static void main (String[] args) {
        // =================EXO 1=======================
        // Animal isidore = new Animal("Isidore",4,Animal.Type.MAMMAL) ;
        // System.out.println(isidore.getName()+" has "+isidore.getLegs()+" legs and is a " + isidore.getType() + ".");
        // }

        // =================EXO 2=======================        
        // Animal cat = new Animal("Whiskers", 4, Animal.Type.MAMMAL);
        // Animal fish = new Animal("Nemo", 0, Animal.Type.FISH);
        // Animal bird = new Animal("Tweety", 2, Animal.Type.BIRD);
        // Animal dog = new Animal("Rex", 4, Animal.Type.MAMMAL);

        // System.out.println(Animal.getNumberOfAnimals());
        // System.out.println(Animal.getNumberOfMammals());
        // System.out.println(Animal.getNumberOfFish());
        // System.out.println(Animal.getNumberOfBirds());

        // =================EXO 3=======================        
        // Cat isidore = new Cat( "Isidore","orange");
        // Cat esidore = new Cat( "Esidore");

        // System.out.println(isidore.getName()+" has "+isidore.getLegs()+ " legs and is a " + isidore.getType()+ "." ) ;
        // System.out.println(esidore.getName()+" has "+esidore.getLegs()+ " legs and is a " + esidore.getType()+ "." ) ;

        // isidore.meow () ;
        // esidore.meow () ;

        // =================EXO 4=======================        
        // Canary titi = new Canary("Titi");
        // Shark willy = new Shark("Willy"); // Yes Willy is a shark here !
        // willy.status();
        // willy.smellBlood(true);
        // willy.status();
        // titi.layEgg();
        // System.out.println(titi.getEggsCount());

        //==================EXO 5========================
        // Shark willy = new Shark ("Willy") ; // Yes Willy is a shark here !
        // Canary titi = new Canary ("Titi") ;
        // Shark tkt = new Shark("tkt");

        // willy.canEat(titi);
        // willy.eat(titi);
        // willy.canEat(willy);
        // willy.eat(willy);
        // willy.canEat(tkt);
        // willy.eat(tkt);

        //==================EXO 6========================
        BlueShark willy = new BlueShark("Willy");
        GreatWhite gros_willy = new GreatWhite("Gros Willy");
        Canary petit_oiseau = new Canary("Petit Oiseau");

        gros_willy.canEat(gros_willy);
        gros_willy.canEat(willy);
        gros_willy.canEat(petit_oiseau);
        gros_willy.eat(willy);
        gros_willy.eat(petit_oiseau);
        gros_willy.eat(gros_willy);

        willy.canEat(petit_oiseau);
        willy.canEat(gros_willy);
        willy.canEat(willy);
        willy.eat(petit_oiseau);
        willy.eat(gros_willy);
        willy.eat(willy);

    }
    
}
