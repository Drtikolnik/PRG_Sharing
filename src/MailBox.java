import java.util.*;

public class MailBox {
    Scanner sc = new Scanner(System.in);
    private List<String> letters;

    public synchronized void addLetter(String letter){
        letters.add(letter);
        System.out.println("Dopis byl doručen: " + letter);
    }

    public synchronized void getLetter(){
        for(String l : letters){
            System.out.println("Dopis vyzvednut: " + l);
            letters.remove(l);
        }


    }







}
