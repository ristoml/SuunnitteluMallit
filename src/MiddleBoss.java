public class MiddleBoss extends Boss{
    private final double ALLOWABLE = 4;

    public void processRequest(SalaryRequest request) {
        if (request.getAmount() <= ALLOWABLE) {
            System.out.println("Middle boss allows pay raise request of " + request.getAmount()+" %.");
        } else {
            super.processRequest(request);
        }
        
    }
    
}
