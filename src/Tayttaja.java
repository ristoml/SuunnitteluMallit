public abstract class Tayttaja implements Pizza {
    protected Pizza taytettavaPizza;
    
    public Tayttaja (Pizza taytettava) {
        this.taytettavaPizza = taytettava;
    }
    public void kerroTayte() {
        taytettavaPizza.kerroTayte();
    }
    public int getHinta() {
        return taytettavaPizza.getHinta();
    }    
}
