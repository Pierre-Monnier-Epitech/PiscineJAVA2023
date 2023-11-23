public class Snake {
    private String name="Unknown";
    public String getName() 
    { 
        return this.name; 
    } 

    public Snake(String name) {
        this.name= name;
    }

    public Snake() {
        System.out.println("I'm a Snake!");
    } 
}

