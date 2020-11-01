import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Komponentti {
    private int hinta;
    private List<Komponentti> komponentit; 

    public Kotelo(int hinta) {
        this.hinta = hinta;
        komponentit = new ArrayList<>();
    }
    public void lisaaKomponentti(Komponentti komponentti) {
        this.komponentit.add(komponentti);
    }
    public int hinta() {
        int palautettava = this.hinta;
        for (Komponentti k : this.komponentit) {
            palautettava+=k.hinta();
        }
        return palautettava;
    }    
}
