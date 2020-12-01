public class App {
    public static void main(String[] args) throws Exception {
        Kello k = new Kello(10, 10, 10);
        k.etene();
        k.tulostaAika();

        Kello k2 = (Kello)k.clone();
        k2.tulostaAika();
        k.etene();
        k.tulostaAika();
        k2.tulostaAika();
        k2.etene();
        k.tulostaAika();

    }
}
