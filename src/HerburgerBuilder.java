import java.util.ArrayList;
import java.util.List;

public class HerburgerBuilder extends BurgerBuilder {
    private List<Object> koostumus = new ArrayList<>();

    @Override
    public void buildSalaatti() {
        koostumus.add(new Salaatti());

    }

    @Override
    public void buildSampyla() {
        koostumus.add(new Gluteeniton());

    }

    @Override
    public void buildPihvi() {
        koostumus.add(new Vege());

    }

    @Override
    public Burger getBurger() {
        return burger;
    }

}
