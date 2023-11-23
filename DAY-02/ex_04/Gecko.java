public class Gecko {
    private String name = "Unknown";
    private int age = 0;
    
    public Gecko() {
        System.out.println("Hello!");
    }    
    
    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + name + "!");
    }
    
    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public int getAge() {return age;}

    public void status() {
        switch(age) {
            case 0:
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
                break;
        }
    }
}
