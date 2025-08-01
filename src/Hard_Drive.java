public class Hard_Drive {
    private final String type;
    private final int capacityGB;

    public Hard_Drive(String type, int capacityGB) {
        this.type = type;
        this.capacityGB = capacityGB;
    }

    public String getType() {
        return type;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    @Override
    public String toString() {return String.format("HD Type: %s HD Capacity: %d", getType(), getCapacityGB());}
}
