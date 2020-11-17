public abstract class PokemonState {
    void changeState(Pokemon p, PokemonState s) {
        p.changeState(s);
    };
    void action(Pokemon p){};
    void accept(Visitor visitor) {
       visitor.visit(this);
    }
        
}
