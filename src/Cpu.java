public class Cpu {
    public void Freeze() {
        System.out.println("Cpu freezed");
    };
    public void Jump(long position) {
        System.out.println("Cpu new position: " + position);
    }
    public void Execute() {
        System.out.println("Cpu executing..");
    }
    
}
