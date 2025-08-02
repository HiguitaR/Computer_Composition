public record Hard_Drive(String type, int capacityGB) {

    public static void starterHD() {
        System.out.println("Turning on Hard Drive!✅");
    }

    @Override
    public String toString() {
        return String.format(" HD Type: %s Capacity: %d GB", type(), capacityGB());
    }
}
