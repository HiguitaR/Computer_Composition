public class Ram {
    private final int capacityGB;

    public Ram(int capacityGB) {
        this.capacityGB = capacityGB;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    @Override
    public String toString() {return String.format("RAM capacity: %d GB", getCapacityGB());}
}
