public class AdidasTehdas implements Vaatetehdas {
    public Housut makeHousut() {
        return new AdidasHousut();
    }

    public Paita makePaita() {
        return new AdidasPaita();
    }

    public Kengat makeKengat() {
        return new AdidasKengat();
    }

    public Lippis makeLippis() {
        return new AdidasLippis();
    }

}
