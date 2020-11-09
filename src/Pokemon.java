public class Pokemon {
    private PokemonState state;

    public Pokemon() {
        this.state = new Charmander();
    }    
    public void action() {
        state.action(this);
    }
    
    protected void changeState(PokemonState p) {
        state = p;
    }
    
}
