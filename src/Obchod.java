public class Obchod {
    private int pocetPolozek=50;


    public synchronized void nakup(int pocet){
        if(pocetPolozek>pocet){
            pocetPolozek -= pocet;
            System.out.println("bylo odebráno " +pocet+ " položek, na skladě zbývá " +pocetPolozek);
        }else{
            System.out.println("Na skladě není dostatek položek");
        }
    }

    public synchronized void dopln(int pocet){
        pocetPolozek += pocet;
        System.out.println("bylo doplněno " +pocet+ " položek, na skladě je nyní " +pocetPolozek);
    }




}
