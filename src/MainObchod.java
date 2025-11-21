import java.util.Scanner;

public class MainObchod {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Obchod obchod = new Obchod();

        Thread t1 = new Thread(()->{
            for(int i=0;i<5;i++){
                obchod.nakup((int)(Math.random()*(10-1))+1);
            }
        });


        Thread t2 = new Thread(()->{
            for(int i=0;i<5;i++){
                obchod.dopln((int)(Math.random()*(15-5))+5);
            }
        });


        Thread t3 = new Thread(()->{
            System.out.println("Kolik chceš přidat a odebrat položek?");
            System.out.println("Přidat:");
            obchod.dopln(sc.nextInt());
            sc.nextLine();
            System.out.println("Odebrat:");
            obchod.nakup(sc.nextInt());
            sc.nextLine();
        });



        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
            throw new RuntimeException();
        }
















    }
}
