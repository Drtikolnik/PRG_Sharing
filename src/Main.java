public class Main {
    public static void main(String[] args) {

    Banka banka = new Banka();

    Thread t1 = new Thread(()->{
        try{
            banka.vyberStovku();
            Thread.sleep(1000);
            banka.vyberStovku();
            Thread.sleep(1000);
            banka.vyberStovku();
            Thread.sleep(1000);
            System.out.println("----------------------------");
        }catch(Exception e){
            e.printStackTrace();
        }
    });

    Thread t2 = new Thread(()->{
        try{
            banka.pridejDveste();
            Thread.sleep(1000);
            banka.pridejDveste();
            Thread.sleep(1000);
            banka.pridejDveste();
            Thread.sleep(1000);
            System.out.println("----------------------------");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    });

    t1.start();
    t2.start();








    }
}