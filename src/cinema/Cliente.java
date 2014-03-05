package cinema;

public class Cliente implements Runnable{
    char posti [][]= new char [10][10];
    String nome;
    Sala buffer = new Sala();
    int opzione, f, p, numero_posti;
    
    Cliente(char posti [][], int opzione, int numero_posti) {
        this.posti = posti;
        this.opzione = opzione;
        this.numero_posti = numero_posti;
    }
    
    public void run(){
        
        f = (int)(Math.random() * 9);
        p = (int)(Math.random() * 9);
        switch(opzione){
            case 0:
                for(int i=p; i<numero_posti; i++){
                    if(posti[f][i] == 'L'){
                        posti[f][i] = 'P';
                    }    
                    else{
                        System.out.println("\nposto gia occupato\n\n");
                    }
                }
                buffer.stampa(posti);
                break;
            case 1:
                for(int i=p; i<numero_posti; i++){
                    if(posti[f][i] == 'L'){
                        posti[f][i] = 'A';
                    }    
                    else{
                        System.out.println("\nposto gia occupato\n\n");
                    }
                }
                buffer.stampa(posti);
                break;
            case 2:
                if(posti[f][p] == 'P'){
                    posti[f][p] = 'L';
                    buffer.stampa(posti);
                }
                else if(posti[f][p] == 'A' || posti[f][p] == 'L'){
                    System.out.println("\nPosto acquistato o libero... Impossibile disdire la prenotazione cambiare il numero del posto\n\n");
                }
                break;
        }
    }
}