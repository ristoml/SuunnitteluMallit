public class Charmander extends PokemonState{
    @Override
    public void action(Pokemon p) {
        System.out.println("Pokemon hyppää");
        changeState(p, new Charmeleon());
    }
    
    public void accept(BonusVisitor visitor) {
        visitor.visit(this);
    }
    
}
