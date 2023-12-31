package Composite;

import java.util.*;

public class SentenceComposite implements Sentence {

    List<Sentence> childSentence = new ArrayList<>();

    @Override 
    public void print(){
        for (Sentence sentence : childSentence) {
            sentence.print();
       }
    }

    public void add(Sentence sentence){
        childSentence.add(sentence);
    }

    public void remove(Sentence sentence){
        childSentence.remove(sentence);
    }
    
}
