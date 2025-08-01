public class Cpu {
    private final Double speed;

    public Cpu(Double speed) {
        this.speed = speed;
    }

    public Double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {return String.format("CPU speed: %.2f", getSpeed());}
}
