public class ComputerFacade {
    Cpu cpu = new Cpu();
    Memory memory = new Memory();
    HardDrive hd = new HardDrive();

    public void Start() {
        cpu.Freeze();
        memory.Load(0, hd.Read(0, 8192));
        cpu.Jump(0);
        cpu.Execute();
    }
    
}
