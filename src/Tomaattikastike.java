public class Tomaattikastike extends Tayttaja {
    public Tomaattikastike (Pizza taytettavaPizza) {
        super(taytettavaPizza);
    }
    
    @Override
    public int getHinta() {        
        return 2;
    }
    @Override
    public void kerroTayte() {
        super.kerroTayte();
        System.out.println("\nTomaattikastike");
        
    }

}

