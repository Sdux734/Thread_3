import java.util.concurrent.Semaphore;


public class App {

    static final int MAX = 4;

    public static void main(String[] args) throws Exception {

        //  main piu elegante
        String nomi[] = {"marco", "matteo", "tommaso", "giovanni"};
        Corridore lista[] = new Corridore[MAX];

        for(int i = 0; i < MAX; i++){
            lista[i] = new Corridore(nomi[i]);
            lista[i].start();
        }

        for(int i = 0; i < MAX; i++){
            lista[i].join();    //metodo join() mette in pausa il thread su cui lo uso fino a che l'operazione in corso non ha finito
        }

        System.out.println("Gara finita");


         
        /* 
        //dichiaro i thread

        Corridore c1 = new Corridore("marco");
        Corridore c2 = new Corridore("matteo");
        Corridore c3 = new Corridore("tommaso");
        Corridore c4 = new Corridore("giovanni");

        //metto in coda (pronti a essere assegnati ad un processo del processore) i thread 

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        */
        }
     
    }
        
        



