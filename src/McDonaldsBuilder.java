public class McDonaldsBuilder extends BurgerBuilder{
    public void buildSalaatti() {
        burger.setPihvi("Jäävuori");        
    }
    public void buildSampyla() {
        burger.setSampyla("Vehnä");
    }
    public void buildPihvi() {
        burger.setPihvi("Nauta");
    }
    @Override
    public Burger getBurger() {
        return this.burger;
    }
    
}
