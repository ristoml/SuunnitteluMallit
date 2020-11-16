public class App {
    public static void main(String[] args) throws Exception {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Pelaaja pelaaja = new Pelaaja(arvuuttaja);
        pelaaja.pelaa();
    }
}
