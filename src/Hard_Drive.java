public record Hard_Drive(String type, int capacityGB) {

    /**
     * Start Method static to connect with the computer starter method
     */
    public static void starterHD() {
        System.out.println("Turning on Hard Drive!✅");
    }

    @Override
    public String toString() {
        return String.format(" HD Type: %s Capacity: %d GB", type(), capacityGB());
    }
}
