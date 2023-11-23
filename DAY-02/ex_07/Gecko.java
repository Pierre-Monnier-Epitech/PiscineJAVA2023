public class Gecko {

    private String name="Unknow";
    private int age=-1;
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

    public Gecko(String name,int age,String nourriture) {
        this.name= name;
        this.age = age;
    }

    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public int getAge() {return age;}

    public int getEnergy() {return energy;}
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

}

