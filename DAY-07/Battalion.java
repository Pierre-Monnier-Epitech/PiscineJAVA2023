import java.util.*;

public class Battalion{

    private List<Character> characters = new ArrayList<Character>();

    public Battalion(){}

    public <T extends Character> void add(List<T> toAdd) {
        for (int i = 0; i < toAdd.size(); i++) {
            characters.add(toAdd.get(i));
        }
    }

    public void display(){
        for (int i = 0; i < characters.size(); i++) {
        System.out.println(characters.get(i).getName());
        }
    }

    public boolean fight(){
        if (characters.size() >= 2){
            Character first = characters.get(0);
            Character second = characters.get(1);

            int result = first.compareTo(second);

            if (result > 0) {
                characters.remove(1);
            } else if (result < 0) {
                characters.remove(0);
            } else {
                characters.remove(0);
                characters.remove(0);
            }

            return true;
        } else {
            return false; 
        }
        }
    }



