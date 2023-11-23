package Factory;
import java.util.*;

public class Factory {

    public Toy create(String cadeau) throws NoSuchToyException{
        if(cadeau.equals("teddy")){
            return new TeddyBear();
        }else if(cadeau.equals("gameboy")){
            return new Gameboy();
        }else{
            throw new NoSuchToyException("No such toy: " + cadeau + ".");
        }
    }

    public List<GiftPaper> getPapers(int n){
        List<GiftPaper> liste = new ArrayList<GiftPaper>();
        for(int i = 0; i< n; i++){
            GiftPaper paper = new GiftPaper();
            liste.add(paper);
        }
        return liste;
    }
}
