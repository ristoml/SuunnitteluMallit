public class Tuntiviisari {
    private int aika;

    public Tuntiviisari() {
        this.aika = 0;
    }

    public Tuntiviisari(int a) {
        if (a >= 0 && a <= 24) {
            this.aika = a;
        } else {
            this.aika = 0;
        }
    }

    public void etene() {
        if (this.aika < 24) {
            this.aika++;
        } else {
            this.aika = 0;
        }
    }

    public int getAika() {
        return this.aika;
    }

    public void setAika(int a) {
        if (a >= 0 && a <= 24) {
            this.aika = a;
        } else {
            this.aika = 0;
        }
    }

}
