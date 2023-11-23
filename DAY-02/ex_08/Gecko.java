public class Gecko {

    

    private String name="Unknown";
    private int age=0;
    private int energy=100;


    public Gecko(String name) {
        this.name= name;
        System.out.println("Hello "+name+"!");
    }

    public Gecko() {
        System.out.println("Hello!");
    }

    public Gecko(String name,int age) {
        this.name= name;
        this.age = age;
        System.out.println("Hello "+name+"!");
    }


    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public int getAge() {return age;}

    public int getEnergy() { return this.energy; }
    public void setEnergy(int energy) { 
        if (energy>100){this.energy= 100;}
        else if (energy<0){this.energy=0;}
        else {this.energy = energy;}
    } 

    public void status() {
        switch(age) {
            case 0 :
                System.out.println("Unborn Gecko");
                break;

            case 1,2:
                System.out.println("Baby Gecko");
                break;

            case 3,4,5,6,7,8,9,10:
                System.out.println("Adult Gecko");
                break;

            case 11,12,13:
                System.out.println("Old Gecko");
                break;

            default:
                System.out.println("Impossible Gecko");
        }
    }

    public void hello(int repete){
        for (int i = 0; i < repete; i++ ) {
            System.out.println("Hello, I'm "+this.name+"!");
        }
    }

    public void hello(String nom){
        System.out.println("Hello "+nom+", I'm "+this.name+"!");
    }

    public void eat(String nourriture){
        switch(nourriture.toLowerCase()){
            case "meat":
            setEnergy(energy+10);;
            System.out.println("Yummy!");
            break;
        case "vegetable":
            setEnergy(energy-10);
            System.out.println("Erk!");
            break;
        default:
            System.out.println("I can't eat this!");
    }
    }

    public void work() {
        if (this.energy >= 25 ) {
            this.energy -= 9;
            System.out.println("I'm working T.T");
        }
        else {
            this.energy+=50;
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
        }
    }

    public void fraternize(Gecko friend) {
        if (friend.getEnergy() >= 30 && this.getEnergy() >= 30) {
            friend.setEnergy(friend.getEnergy() - 30);
            this.setEnergy(this.getEnergy() - 30);
            System.out.println("I'm going to drink with "+ friend.getName());
            System.out.println("I'm going to drink with "+ this.getName());

        }
        else if (this.getEnergy()<30 && friend.getEnergy()<30){
            System.out.println("Not today!");
            System.out.println("Not today!");
        }

        else if (this.getEnergy()< 30) {
            System.out.println("Sorry "+ friend.getName()+", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then!");
        }
            
        else {
            System.out.println("Sorry "+ this.getName()+", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then!");
        }
    }

        public void fraternize(Snake friend) {
            if (this.getEnergy() >= 10) {
                System.out.println("LET'S RUN AWAY!!!");
                this.setEnergy(this.getEnergy()- this.getEnergy());
            }
            else 
                System.out.println("...");
            }
        }


