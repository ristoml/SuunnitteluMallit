public class App {
    public static void main(String[] args) throws Exception {       
        
        SmallBoss pikkupomo = new SmallBoss();
        MiddleBoss keskipomo =  new MiddleBoss();
        BigBoss isopomo = new BigBoss();

        pikkupomo.setSuccessor(keskipomo);
        keskipomo.setSuccessor(isopomo);

        pikkupomo.processRequest(new SalaryRequest(2));
        pikkupomo.processRequest(new SalaryRequest(4));
        pikkupomo.processRequest(new SalaryRequest(5));



    }
}
