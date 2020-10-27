public class Vaatevalinta {
    public Vaatevalinta pueVaatteet(Vaatetehdas tehdas) {
        Housut housut = tehdas.makeHousut();
        Kengat kengat = tehdas.makeKengat();
        Paita paita = tehdas.makePaita();
        Lippis lippis = tehdas.makeLippis();
        return tehdas;        
    }
    
}
