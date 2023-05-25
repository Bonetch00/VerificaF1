public class Box {

    public Box() {
    }

    public void usa(){
        System.out.println("PIT-STOP "+Thread.currentThread().getName()+" cambio gomme in corso");

    }

    public void esce(){
        System.out.println("PIT-STOP "+Thread.currentThread().getName()+" FINITO");
    }
}
