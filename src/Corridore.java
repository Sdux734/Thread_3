import java.util.concurrent.Semaphore;


public class Corridore extends Thread{  //estendo la classe Thread

    //dichiaro gli attributi della classe con costruttori getter e setter

    private String nome;

    public Corridore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //costruisco il metodo run() dandoli le direttive sul cosa dovranno fare  i thread in esecuzione

    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println(nome + " metri percorsi: " + i );

            try{

                Thread.sleep(100);  //  metodo sleep() che fa attendere un determinato valore di tempo passato nel metodo
            }catch(Exception e){}

            if(i == 100){
                System.out.println("il corridore " + nome + " e' arrivato");
            }
        }
    }

    
}