import java.util.*;

public class MailBox {
    Scanner sc = new Scanner(System.in);
    private List<String> letters;

    public MailBox() {
        this.letters = new ArrayList<>();
    }

    public synchronized void addLetter(String letter){
        letters.add(letter);
        System.out.println("Dopis byl doručen: " + letter);
        notify();
    }

    public synchronized void getLetter(){
        while(letters.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Iterator<String> it = letters.iterator();
        while(it.hasNext()){
            String l = it.next();
            System.out.println("Dopis vyzvednut: " + l);
            it.remove();
        }
    }







}
