public record Hard_Drive(String type, int capacityGB) {

    public void starterHD() {
        System.out.println("Turning on Hard Drive!✅");
    }

    @Override
    public String toString() {
        return String.format("HD Type: %s HD Capacity: %d", type(), capacityGB());
    }
}
