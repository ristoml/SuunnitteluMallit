public class Kello implements Cloneable {
    private Tuntiviisari tv;
    private Minuuttiviisari mv;
    private Sekuntiviisari sv;

    public Kello(int tva, int mva, int sva) {
        tv = new Tuntiviisari(tva);
        mv = new Minuuttiviisari(mva);
        sv = new Sekuntiviisari(sva);
    }
    public void etene() {
        if (sv.getAika() == 59) {
            if (mv.getAika() == 59) {
                if (tv.getAika() == 23) {
                    tv.setAika(0);
                    mv.setAika(0);
                    tv.setAika(0);
                }
                tv.etene();
            }
            mv.etene();
        }
        sv.etene();
    }
    public void tulostaAika() {
        System.out.println(tv.getAika() +":"+mv.getAika()+":"+sv.getAika());
    }
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }    
}
