import Factory.*;

public class Exemple {

    public static void main(String args[]) {

        System.out.println("--- Ex02 ---");

        Elf elfo = new Elf(new Factory());

        // trouve pas de jouet
        elfo.pickToy("existe pas");

        //peut pas pack car pas de feuille
        elfo.pack();

        // prend feuilles
        elfo.pickPapers(5);

        // peut pas pack car pas de jouet
        elfo.pack();      

        // pick un teddy
        elfo.pickToy("teddy");

        // peut pas car teddy en main
        elfo.pickToy("gameboy");

        // pack
        elfo.pack();

    }

    
}