import java.util.Random;

public class Arvuuttaja {
    private Random rand;

    public Arvuuttaja() {
        rand = new Random();
    }

    public Object joinGame() {
        int luku = rand.nextInt(10);
        return new Memento(luku);
    }

    public boolean arvaaLuku(int luku, Object o) {
        Memento meme = (Memento)o;
        if (luku == meme.getArvaus()) {
            return true;
        }
        return false;
    }

    private class Memento{
        private int arvaus;

        public Memento(int a) {
            this.arvaus = a;
        }
        public int getArvaus() {
            return arvaus;
        }
    }

    
}
