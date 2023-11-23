import java.util.ArrayList;


public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var) {
        ArrayList<String> list = new ArrayList<>();
        for (String mot : var) {
            list.add(mot);
        }
        return list;
    }
}
