public record Ram(int capacityGB) {

    public void starterRam() {
        System.out.println("Turning on Ram!✅");
    }


    @Override
    public String toString() {
        return String.format("RAM capacity: %d GB", capacityGB());
    }
}
