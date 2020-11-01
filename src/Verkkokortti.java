public class Verkkokortti implements Komponentti {
    private int hinta;

    public Verkkokortti(int hinta) {
        this.hinta = hinta;
    }
    public int hinta() {
        return hinta;
    }    
}
