public class BossTehdas implements Vaatetehdas {

    public Housut makeHousut() {
        return new BossHousut();
    }

    public Paita makePaita() {
        return new BossPaita();
    }

    public Kengat makeKengat() {
        return new BossKengat();
    }

    public Lippis makeLippis() {
        return new BossLippis();
    }    

}
