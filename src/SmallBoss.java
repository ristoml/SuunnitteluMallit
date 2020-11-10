public class SmallBoss extends Boss{
    private final double ALLOWABLE = 2;

    public void processRequest(SalaryRequest request) {
        if (request.getAmount() <= ALLOWABLE) {
            System.out.println("Small boss allows pay raise request of " + request.getAmount()+" %.");
        } else {
            super.processRequest(request);
        }
        
    }
    
}
