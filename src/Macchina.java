public class Macchina extends Thread{
    private int nd;
    private String scuderia;
    private String pilota;
    private Box box;
    private Semaforo semaforo;

    

    public Macchina(String pilota, int nd, String scuderia, Box box, Semaforo semaforo) {
        super(pilota);
        this.nd = nd;
        this.scuderia = scuderia;
        this.pilota=pilota;
        this.box = box;
        this.semaforo = semaforo;
    }



    @Override
    public void run(){
        for(int i=1;i<11;i++){
            int tempoGiro=(int)(Math.random()*4+1);
            try {
                Thread.sleep(tempoGiro);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            if(i==3||i==6||i==9){
                semaforo.P();
                int pausa=(int)(Math.random()*5+1);

                box.usa();
                try {
                    Thread.sleep(pausa);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                semaforo.V();
                box.esce();
            }
            System.out.println("GIRO-"+i+" Completato"+pilota);
        }

    }
    
}