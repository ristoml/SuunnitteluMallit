public class BonusVisitor implements Visitor {
    public void visit(Charmander c) {
        System.out.println("Annetaan 3 bonuspistettä");
    }
    public void visit(Charmeleon charmeleon) {
        System.out.println("Annetaan 6 bonuspistettä");
    }
    public void visit(Charizad charizad) {
        System.out.println("Annetaan 9 bonuspistettä");
    }
    
}
