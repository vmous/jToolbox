package toolbox.design.patterns.structural.facade;

/**
 * Subsystem class. Implement subsystem functionality having no knowledge of the
 * facade.
 *
 * @author billy
 */
public class HardDrive {

    public HardDrive() {
    }

    public byte[] read(long lba, int size) {
        System.out.println("Reading " + size
                + " bytes from logical block address 0x"
                + Long.toHexString(lba) + ".");// TODO Method stub
        return null;
    }

}
