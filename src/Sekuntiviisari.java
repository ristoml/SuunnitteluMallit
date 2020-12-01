public class Sekuntiviisari {
    private int aika;

    public Sekuntiviisari() {
        this.aika = 0;
    }

    public Sekuntiviisari(int a) {
        if (a >= 0 && a <= 60) {
            this.aika = a;
        } else {
            this.aika = 0;
        }
    }

    public void etene() {
        if (this.aika < 60) {
            this.aika++;
        } else {
            this.aika = 0;
        }
    }

    public int getAika() {
        return this.aika;
    }

    public void setAika(int a) {
        this.aika = a;
    }

}
