public class Tarjoilija {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder bb) {
        this.burgerBuilder = bb;
    }
    public Burger getBurger() {
        return burgerBuilder.getBurger();
    }
    public void constructBurger() {
        burgerBuilder.createNewBurgerProduct();
        burgerBuilder.buildSampyla();
        burgerBuilder.buildPihvi();
        burgerBuilder.buildSalaatti();
    }
}
