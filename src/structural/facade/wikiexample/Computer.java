package structural.facade.wikiexample;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(12, hardDrive.read(12, 23));
        cpu.jump(12);
        cpu.execute();
    }
}
