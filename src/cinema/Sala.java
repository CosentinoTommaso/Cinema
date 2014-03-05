package cinema;

public class Sala {
    char posti [][]= new char [10][10];
    
    synchronized void stampa(char posti [][]){
        this.posti = posti;
        System.out.println("<=     Schermo     =>");
        for(int f=0; f<10; f++){
            for(int p=0; p<10; p++){
                System.out.print(" " + posti[f][p]);
            }
            System.out.print("\n");
        }
        System.out.println(" ^                 ^ ");
        System.out.println("| |               | |\n\n");
    }
}
