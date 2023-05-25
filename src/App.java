public class App {
    public static void main(String[] args) throws Exception {
        Box b=new Box();
        Semaforo s=new Semaforo(2);
        Macchina m1=new Macchina("Hamilton",  44 , "Mercedes", b, s);
        Macchina m2=new Macchina("Verstappen",  33 , "RedBull", b, s);
        Macchina m3=new Macchina("Leclerc",  16 , "Ferrari", b, s);
        Macchina m4=new Macchina("Alonso",14,"Aston Martin",b,s);

        System.out.println("ROSSO...ROSSO...ROSSO...ROSSO...VERDE!!!!");
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m1.join();
        m2.join();
        m3.join();
        m4.join();
        System.out.println("!!!Bandiera a scacchi!!!");
        System.out.println("Fine Gara.");

    }
}
