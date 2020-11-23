abstract class BurgerBuilder {
    protected Burger burger;
    
    public Burger getBurger() {
        return burger;
    }

    public void createNewBurgerProduct() {
        burger = new Burger();
    }
    public abstract void buildSalaatti();
    public abstract void buildSampyla();
    public abstract void buildPihvi();
}
