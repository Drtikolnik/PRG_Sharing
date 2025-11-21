public class Banka {
    private double zustatek = 1000;

    public synchronized void vyberStovku(){
        zustatek -= 100;
        System.out.println("bylo ubráno 100 kč, zustatek: " + zustatek);
    }


    public synchronized void pridejDveste(){
        zustatek += 200;
        System.out.println("bylo přidáno 200kč, zustatek: " + zustatek);
    }













}
