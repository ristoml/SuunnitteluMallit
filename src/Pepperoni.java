public class Pepperoni extends Tayttaja{
    public Pepperoni (Pizza taytettavaPizza) {
        super(taytettavaPizza);
    }
    
    @Override
    public int getHinta() {        
        return 2;
    }
    @Override
    public void kerroTayte() {
        super.kerroTayte();
        System.out.println("\nPepperoni");
        
    }

}

