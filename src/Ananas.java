public class Ananas extends Tayttaja {
    public Ananas (Pizza taytettavaPizza) {
        super(taytettavaPizza);
    }
    
    @Override
    public int getHinta() {        
        return 2;
    }
    @Override
    public void kerroTayte() {
        super.kerroTayte();
        System.out.println("\nAnanas");
        
    }

}
