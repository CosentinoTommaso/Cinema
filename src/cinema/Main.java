package cinema;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        char posti[][]=new char[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                posti[i][j]='L';
            }
        }
        Sala buffer = new Sala();
        buffer.stampa(posti);
        int n, opzione, numero_posti;
        n = (int)(Math.random() * 10);
        
        for(int i=0; i<=n; i++){
            opzione = (int)(Math.random() * 2);
            numero_posti = (int)(Math.random() * 10 + 1);
            Cliente T1 = new Cliente(posti, opzione, numero_posti);
            Thread newThrd1 = new Thread(T1);
            newThrd1.start();
            newThrd1.sleep(1000);
        }
    }
}
