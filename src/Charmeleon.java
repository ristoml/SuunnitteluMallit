public class Charmeleon extends PokemonState{
    @Override
    public void action(Pokemon p) {
        System.out.println("Pokemon ampuu");
        changeState(p, new Charizad());
    }
}