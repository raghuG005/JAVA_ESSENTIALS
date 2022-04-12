package ComparableVsComparator;

public class Laptop implements Comparable<Laptop> {

    private String name;
    private int ramCapacity;
    private int hardwareStorage;
    private String processor;

    public Laptop(String name, int ramCapacity, int hardwareStorage, String processor) {
        this.name = name;
        this.ramCapacity = ramCapacity;
        this.hardwareStorage = hardwareStorage;
        this.processor = processor;
    }

    /*
     * returns positive or negative integer
     * 
     */

    @Override
    public int compareTo(Laptop objlaptop) {
        return this.getRamCapacity() > objlaptop.getRamCapacity() ? 1 : -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getHardwareStorage() {
        return hardwareStorage;
    }

    public void setHardwareStorage(int hardwareStorage) {
        this.hardwareStorage = hardwareStorage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop [hardwareStorage=" + hardwareStorage + ", name=" + name + ", processor=" + processor
                + ", ramCapacity=" + ramCapacity + "]";
    }

}
