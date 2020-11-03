public class Pohja extends Tayttaja {
    public Pohja (Pizza taytettavaPizza) {
        super(taytettavaPizza);
    }
    
    @Override
    public int getHinta() {        
        return super.getHinta() + 2;
        
    }
    @Override
    public void kerroTayte() {
        super.kerroTayte();
        System.out.println("\nPohja");
        
    }

}
