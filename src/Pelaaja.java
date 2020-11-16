import java.util.Random;

public class Pelaaja {
    private Arvuuttaja a;
    private Random r;
    private Object o;

    public Pelaaja(Arvuuttaja a) {
        this.a = a;
        this.r = new Random();
        this.o = a.joinGame();
    }

    public void pelaa() {
        int arvaus = r.nextInt(10);
        while (!a.arvaaLuku(arvaus, o)) {
            arvaus = r.nextInt(10);
        }
        System.out.println("Pelaaja arvasi luvun "+ arvaus+" oikein");

    }
    
}
