public class Semaforo {
    int valore;

    public Semaforo(int valore) {
        this.valore = valore;
    }
    
    public synchronized void P(){
        while(valore==0){
            System.out.println("----------"+Thread.currentThread().getName()+" in attesa al box ----------");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valore--;
    }

    public synchronized void V(){
        valore++;
        notify();
    }
}
