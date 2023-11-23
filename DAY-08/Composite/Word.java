package Composite;

public class Word implements Sentence{

    private String mot;

    public Word(String mot){
        this.mot = mot;
    }

    @Override
    public void print(){
        System.out.println(mot);
    }
    
}
