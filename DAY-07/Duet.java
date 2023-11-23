public class Duet<T> {

    public static <T extends Comparable<T>> T min(T first,T second){  
        int result= first.compareTo(second);
        if (result <0 ){
            return first;
        } else {
            return second;
        }
    }
  
    public static <T extends Comparable<T>> T max(T first,T second){  
        int result= first.compareTo(second);
        if (result >0 ){
            return first;
        } else {
            return second;
        }
    }
}   