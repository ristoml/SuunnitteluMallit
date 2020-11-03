public class App {
    public static void main(String[] args) throws Exception {
        Pizza tilaus = new Pohja(new Tomaattikastike(new Kinkku(new Juusto())));        
        tilaus.kerroTayte();       
        
    }
}
