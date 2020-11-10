public class BigBoss extends Boss{
    private final double ALLOWABLE = Double.MAX_VALUE;

    public void processRequest(SalaryRequest request) {
        if (request.getAmount() <= ALLOWABLE) {
            System.out.println("Big boss allows pay raise request of " + request.getAmount()+" %.");
        } else {
            System.out.println("????");
        }        
    }    
}

