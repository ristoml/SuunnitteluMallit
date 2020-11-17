public class App {
    public static void main(String[] args) throws Exception {
        Visitor visitor = new BonusVisitor();
        Pokemon pokemon  = new Pokemon();        
        pokemon.accept(visitor);    
        pokemon.action();
        pokemon.accept(visitor);                        
        pokemon.action();
        pokemon.accept(visitor);    
        pokemon.action();
        pokemon.action();
        pokemon.action();
        pokemon.action();        
    }
}
