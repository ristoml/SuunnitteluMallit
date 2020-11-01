
public class App {
    public static void main(String[] args) throws Exception {
        Kotelo kotelo = new Kotelo(50);
        Emolevy emolevy = new Emolevy(100);
        Muistipiiri muistipiiri = new Muistipiiri(80);
        Naytonohjain naytonohjain = new Naytonohjain(300);
        Prosessori prosessori = new Prosessori(300);
        Verkkokortti verkkokortti = new Verkkokortti(30);

        emolevy.lisaaKomponentti(muistipiiri);
        emolevy.lisaaKomponentti(naytonohjain);
        emolevy.lisaaKomponentti(prosessori);
        emolevy.lisaaKomponentti(verkkokortti);

        kotelo.lisaaKomponentti(emolevy);

        System.out.println("Kokoonpanon hinta on " + kotelo.hinta() + " euroa.");
    }
}
