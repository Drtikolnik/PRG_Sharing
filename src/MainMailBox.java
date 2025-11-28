import java.util.*;

public class MainMailBox {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        MailBox m = new MailBox();

        Thread postak = new Thread(()->{
            System.out.println("Napiš dopis:");
            try{
                m.addLetter(sc.nextLine());
            }catch(Exception e){
                e.printStackTrace();
            }
        });


        Thread adresat = new Thread(()->{
            try{
                m.getLetter();
            }catch(Exception e){
                e.printStackTrace();
            }
        });




        postak.start();
        adresat.start();

        try{
            postak.join();
            adresat.join();
        }catch(Exception e){
            e.printStackTrace();
        }








    }
}
