public class Charizad extends PokemonState {
    @Override
    public void action(Pokemon p) {
        System.out.println("Pokemon lentää");
        changeState(p, new Charmander());
    }
    
}
