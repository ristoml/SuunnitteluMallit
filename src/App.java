public class App {
    public static void main(String[] args) throws Exception {
        Tarjoilija tarjoilija = new Tarjoilija();
        BurgerBuilder mcd = new McDonaldsBuilder();
        BurgerBuilder hese = new HerburgerBuilder();

        tarjoilija.setBurgerBuilder(mcd);
        tarjoilija.constructBurger();
        Burger mäkkiburger = tarjoilija.getBurger();

        tarjoilija.setBurgerBuilder(hese);
        tarjoilija.constructBurger();
        Burger heseburger = tarjoilija.getBurger();

    }
}
