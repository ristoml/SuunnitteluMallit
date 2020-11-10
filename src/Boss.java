public abstract class Boss {
    private Boss successor;

    public void setSuccessor(Boss successor) {
        this.successor = successor;
    }

    public void processRequest(SalaryRequest request) {
        if (successor != null) {
            successor.processRequest(request);
        }
    }
}
