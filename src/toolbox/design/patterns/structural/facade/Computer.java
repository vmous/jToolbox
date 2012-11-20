package toolbox.design.patterns.structural.facade;

/**
 * Facade. Knows which subsystem classes are responsible for a request and
 * delegates client requests to the appropriate objects.
 *
 * @author billy
 *
 */
public class Computer {
    private static final long BOOT_ADDRESS = 0x7c00;
    private static final long BOOT_SECTOR = 0x0000;
    private static final int SECTOR_SIZE = 512;

    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }

}
